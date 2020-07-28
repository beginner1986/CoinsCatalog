package pl.beginner.service;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.client.Traverson;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import pl.beginner.model.Coin;

@Log4j2
@Service
public class Client {

	RestTemplate rest = new RestTemplate();
	Traverson traverson = new Traverson(URI.create("http://localhost:8080/api"), MediaTypes.HAL_JSON);
	
	@Getter
	private Map<String, String> links = new HashMap<String, String>();
	
	public Iterable<Coin> getAllCoins() {
		ParameterizedTypeReference<CollectionModel<Coin>> coinType =
				new ParameterizedTypeReference<CollectionModel<Coin>>() {};
		
		CollectionModel<Coin> coinsRes = traverson.follow("coins").toObject(coinType);
		
		Collection<Coin> coins = coinsRes.getContent();
		links.put("first",traverson.follow("coins").follow("first").asLink().getHref());

		log.info("PAGE: " + traverson.follow("coins"));
		//String prev = traverson.follow("coins").follow("prev").asLink().getHref();
		links.put("self", traverson.follow("coins").follow("self").asLink().getHref());
		links.put("next", traverson.follow("coins").follow("next").asLink().getHref());
		links.put("last", traverson.follow("coins").follow("last").asLink().getHref());
		
		log.info("Visited link: " + links.get("self"));
		
		return coins;
	}
	
}
