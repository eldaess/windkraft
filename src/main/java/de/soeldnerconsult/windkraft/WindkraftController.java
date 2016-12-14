package de.soeldnerconsult.windkraft;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import de.soeldnerconsult.windkraft.hersteller.Hersteller;

@Controller
public class WindkraftController {

	@Autowired
	WindkraftService windkraftservice;
	
	
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/windkraftdetails")
	public String windkraftdetails(@RequestParam("id") int id, Model model) {
		model.addAttribute("hersteller_id", getAllHersteller().get(id).getHersteller_id());
		model.addAttribute("hersteller", getAllHersteller().get(id).getHersteller());
		return "windkraftdetails";
	}
	
	
	
	
	
	@RequestMapping("windkraftlist")
	public String windkraft (/*@RequestParam long id, */Model model) {
		
			model.addAttribute("herstellerliste", getAllHersteller());
		return "windkraftlist";

	}
	
	
	
	
	public List<Hersteller> getAllHersteller() {
		
		Hersteller avacon = new Hersteller(1, "Avacon");
		Hersteller enercon = new Hersteller(2, "Enercon");
		Hersteller windicon = new Hersteller();
		windicon.setHersteller("Windicon"); windicon.setHersteller_id(3);
		
		List<Hersteller> hlist = new ArrayList<>();
		hlist.add(enercon); hlist.add(avacon);
		return hlist;
		
	}
	
}
