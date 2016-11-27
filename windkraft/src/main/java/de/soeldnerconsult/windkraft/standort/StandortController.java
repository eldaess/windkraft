package de.soeldnerconsult.windkraft.standort;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StandortController {

	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/windkraft")
	public String windkraft() {
		System.out.println("/windkraft augerufen");
		return "windkraft";
	}
	
}