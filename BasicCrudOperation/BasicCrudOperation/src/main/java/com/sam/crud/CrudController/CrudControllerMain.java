package com.sam.crud.CrudController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sam.crud.CrudEntity.Employee;
import com.sam.crud.CrudService.CrudServiceLayer;

@Controller
public class CrudControllerMain 
{
	@Autowired
	private CrudServiceLayer crudServiceLayer;
	
	@RequestMapping("/")
	public String indexPage(Model model)
	{
		model.addAttribute("obj", crudServiceLayer.displayEmp());
		return "index";
	}
	@RequestMapping("/save")
	public String saveEmp(Employee emp)
	{
		crudServiceLayer.Store(emp);
		return "redirect:/";
	}
	@RequestMapping("/del/{id}")
	public String delEmp(@PathVariable Long id)
	{
		crudServiceLayer.del(id);
		return "redirect:/";
	}
	@RequestMapping("edit/{id}")
	public String edit(@PathVariable Long id,Model model)
	{
		model.addAttribute("id", id);
		model.addAttribute("obj", crudServiceLayer.displayEmp());
		return "index";
	}
	@RequestMapping("/update")
	public String updEmp(@RequestParam Long id,@RequestParam String name,@RequestParam Long Salary,Model model, @ModelAttribute("id")Employee emp)
	{
		Employee exist=new Employee();
		exist.setId(id);
		exist.setName(name);
		exist.setSalary(Salary);
		crudServiceLayer.Store(exist);
		return "redirect:/";
	}
}
