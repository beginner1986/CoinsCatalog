package pl.beginner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;
import pl.beginner.model.Coin;
import pl.beginner.repository.CoinRepository;

@Log4j2
@Controller
public class CatalogController {

	@Autowired
	CoinRepository repository;
	
	@GetMapping("/catalog")
	public String catalog(Model model ) {
		
		log.info("Catalog page visited.");
		
		List<Coin> coins = repository.findAll();
		model.addAttribute("coins", coins);
		
		return "catalog";
	}
}
