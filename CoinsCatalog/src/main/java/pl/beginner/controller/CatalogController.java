package pl.beginner.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;
import pl.beginner.model.Coin;
import pl.beginner.service.Client;
import pl.beginner.service.CoinService;

@Log4j2
@Controller
public class CatalogController {

	@Autowired
	CoinService service;
	
	@Autowired
	Client client;
	
	@GetMapping("/catalog")
	public String catalog(Model model, @Param("keyword") String keyword) {
		
		log.info("Catalog page visited.");
		
		Iterable<Coin> coins = client.getAllCoins();
		model.addAttribute("coins", coins);
		
		Map<String, String> links = client.getLinks();
		model.addAttribute("links", links);
		
		model.addAttribute("keyword", keyword);
		
		return "catalog";
	}
	
}
