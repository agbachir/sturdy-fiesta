package cnss.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cnss.models.Employe;
import cnss.services.EmployeService;

@Controller
public class EmployeController {
	
	@Autowired
	private EmployeService employeService;
	
	@RequestMapping(value = {"/list"}, method =RequestMethod.GET)
	public String listEmploye(Model model) {
		List<Employe> listEmploye = employeService.findAll();
		model.addAttribute("employes", listEmploye);
		return "table";
	}
	
	//public 

}
