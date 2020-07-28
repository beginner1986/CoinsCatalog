package pl.beginner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import pl.beginner.model.Coin;
import pl.beginner.repository.CoinRepository;

@Log4j2
@Service
public class CoinService {

	@Autowired
	CoinRepository repository;
	
	
	public List<Coin> listAll(String keyword) {
		log.info("Search action called.");
		
		if(keyword != null)
			return repository.search(keyword.toUpperCase());
		
		return repository.findAll();
	}
}
