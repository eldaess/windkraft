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

	@RequestMapping(value = "/herstellerliste", method=RequestMethod.GET)
	public ModelAndView herstellerliste(@RequestParam(value="hesteller_id") Integer hersteller_id, @RequestParam(value="hersteller") String hersteller, ModelAndView modelAndView) {
		
		modelAndView.addObject("hersteller", hersteller);
		return modelAndView;
	}
	
	/*@RequestMapping("/windkraft")
	public String windkraft(Model model) {
		
		
		List<Integer> zahlList = new ArrayList<>();
		for(int x=0; x<10; x++){
			zahlList.add(x);
			model.addAttribute("zahl", x);
		}
		
		
	
		
		Hersteller avacon = new Hersteller();
		Hersteller enercon = new Hersteller();
		avacon.setHersteller("Avacon");
		avacon.setHersteller_id(1);
		enercon.setHersteller("Enercon");
		enercon.setHersteller_id(2);
		
		
		List<Hersteller> hL = new ArrayList<Hersteller>();
		hL.add(enercon); hL.add(enercon);
		
		hL.forEach(e -> model.addAttribute("list", e.getHersteller_id()));
		return "windkraft";
	}*/
	
	@RequestMapping("windkraft")
	public String windkraft (@RequestParam long id, Model model) {

		System.out.println(id);
		//return back to index.jsp
		
		//model.addAttribute("prod", hersteller_id);
		

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
	
	
	@RequestMapping("/hersteller")
	public String hersteller() {
		System.out.println("/hersteller aufgerufen");
		return "hersteller";
	}
	
}