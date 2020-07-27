package pl.beginner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.beginner.model.Coin;
import pl.beginner.repository.CoinRepository;

@Service
public class CoinService {

	@Autowired
	CoinRepository repository;
	
	public List<Coin> listAll(String keyword) {
		if(keyword != null)
			return repository.search(keyword.toUpperCase());
		
		return repository.findAll();
	}
}
