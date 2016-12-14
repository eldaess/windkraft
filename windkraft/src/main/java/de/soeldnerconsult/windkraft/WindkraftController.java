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

	
	
	
	/*@RequestMapping("/windkraft")
	public String windkraft(Model model) {
		
		
		List<Integer> zahlList = new ArrayList<>();
		for(int x=0; x<10; x++){
			zahlList.add(x);
			model.addAttribute("zahl", x);
		}
		
		
	
		
	
		
		List<Hersteller> hL = new ArrayList<Hersteller>();
		hL.add(enercon); hL.add(enercon);
		
		hL.forEach(e -> model.addAttribute("list", e.getHersteller_id()));
		return "windkraft";
	}*/
	
	@RequestMapping("windkraft")
	public String windkraft (/*@RequestParam long id, */Model model) {

		
		/*Hersteller phantasticon = new Hersteller();
		phantasticon.setHersteller_id(1);
		phantasticon.setHersteller("phantasticon");	
		
		Hersteller windicon = new Hersteller();
		windicon.setHersteller_id(2);
		windicon.setHersteller("windicon");
		
		List<Hersteller> hlist1 = new ArrayList<>();
		hlist1.add(phantasticon); hlist1.add(windicon);
		
		//model.addAttribute("herstellerliste", hlist);
		for(int x=0; x<hlist1.size(); x++) {
			model.addAttribute("id", hlist1.get(x).getHersteller_id());
			model.addAttribute("hersteller", hlist1.get(x).getHersteller());
		}*/
		

		return "windkraft";

	}

	/*private List<String> getList() {

		List<String> list = new ArrayList<String>();
		list.add("List A");
		list.add("List B");
		list.add("List C");
		list.add("List D");
		list.add("List 1");
		list.add("List 2");
		list.add("List 3");

		return list;

	}*/
	
	
	
	
	
	@RequestMapping("/windkraftlist")
	public String windkraftlist(Model model) {
		model.addAttribute("herstellerliste", getAllHersteller());
		return "windkraftlist";
	}
	
	@RequestMapping("/windkraftdetails")
	public String windkraftdetails(@RequestParam("id") int id, Model model) {
		
		model.addAttribute("hersteller_id", getAllHersteller().get(id).getHersteller_id());
		model.addAttribute("hersteller_id", getAllHersteller().get(id).getHersteller());
		return "windkraftdetails";
	}
	
		
	public List<Hersteller> getAllHersteller() {
		
		Hersteller avacon = new Hersteller(0, "Enercon");
		Hersteller enercon = new Hersteller(1, "Avacon");
		
		List<Hersteller> hlist = new ArrayList<>();
		hlist.add(enercon); hlist.add(avacon);
		return hlist;
		
	}
	
}
