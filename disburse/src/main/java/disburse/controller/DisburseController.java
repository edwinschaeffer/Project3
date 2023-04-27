package disburse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import disburse.dao.HouseDisburseDAO;

@Controller
public class DisburseController {
	
	@Autowired
	private HouseDisburseDAO hdDAO;

	@GetMapping("/home")
	public String getRoot(Model model) {
		return "disburse";
	}
	
	@GetMapping("/highestAmount")
	public String getHighestAmount(Model model) {
		model.addAttribute(hdDAO.getHighestAmount());
		return "disburse";
	}
	/*
	 * @GetMapping("/logout") public String getLogout() { return "logout"; }
	 */
}
