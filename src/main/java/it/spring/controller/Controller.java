package it.spring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.spring.core.Operation;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value = "/numeri")
	public ModelAndView checkParameter(@RequestParam("azione") String azione, Model model) {
		return new ModelAndView("numeri","azione", azione);
	} 
	
	@RequestMapping(value = "/azione")
	public ModelAndView scegliAzione(@RequestParam("numero_1") int numero_1, @RequestParam("numero_2") int numero_2, @RequestParam("azione") String azione,Model model) {
		
		Operation operzaione = new Operation();
		if(azione.equals("addizione")) {
			model.addAttribute("somma", operzaione.sommaValori(numero_1, numero_2));
		}
		if(azione.equals("sottrazione")) {
			model.addAttribute("sottrazione", operzaione.sottraiValori(numero_1, numero_2));
		}
		if(azione.equals("moltiplicazione")) {
			model.addAttribute("moltiplicazione", operzaione.moltiplicaValori(numero_1, numero_2));
		}
		if(azione.equals("divisione")) {
			model.addAttribute("divisione", operzaione.dividiValori(numero_1, numero_2));
		}
		return new ModelAndView("risultato");
	}
	
}
