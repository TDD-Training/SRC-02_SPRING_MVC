package pl.leanleaders.tdd.web;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import pl.leanleaders.tdd.core.Requirement;
import pl.leanleaders.tdd.core.services.RequirementsService;


@Controller	
public class RequirementsController {
	private static final Logger LOG = LoggerFactory.getLogger(RequirementsController.class);

	@Autowired
    private RequirementsService requirementService;
	
	RequirementsController() {
		super();
	}
	
	@RequestMapping("/allRequirements")
	public String getAllRequirements( Model model) {
		return "allRequirements";
	}
	
	@ModelAttribute("requirements")
	public List<Requirement> requirements() {
	    return requirementService.findAll();
	}
	
	@RequestMapping(value = "/addRequirement" , method = RequestMethod.POST)
	public String getAllRequirements( @RequestParam(value="name", required=true) String name, @RequestParam(value="id", required=true) String id, @RequestParam(value="estimation", required=false, defaultValue="M") String estimation, Model model) {
		requirementService.add(new Requirement(id, name, estimation, false, new Date()));
		return "redirect:/allRequirements";
	}

	@ModelAttribute("requirement")
	public Requirement requirement() {
	    return new Requirement();
	}
	
	@RequestMapping("/all")
	public String getAll( Model model) {
		return "all";
	}

}
