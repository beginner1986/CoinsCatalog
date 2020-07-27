package pl.beginner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;
import pl.beginner.model.Coin;
import pl.beginner.service.CoinService;

@Log4j2
@Controller
public class CatalogController {

	@Autowired
	CoinService service;
	
	@GetMapping("/catalog")
	public String catalog(Model model, @Param("keyword") String keyword) {
		
		log.info("Catalog page visited.");
		
		List<Coin> coins = service.listAll(keyword);
		model.addAttribute("coins", coins);
		model.addAttribute("keyword", keyword);
		
		return "catalog";
	}
	
	@GetMapping("/table")
	public String table(Model model, @Param("keyword") String keyword) {
		
		log.info("Catalog in table view visited.");
		
		List<Coin> coins = service.listAll(keyword);
		model.addAttribute("coins", coins);
		model.addAttribute("keyword", keyword);
		
		return "table";
	}
}
