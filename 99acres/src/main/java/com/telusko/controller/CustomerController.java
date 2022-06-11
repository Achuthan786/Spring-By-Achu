package com.telusko.controller;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.jws.WebService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.telusko.bean.CustomerBean;
import com.telusko.dao.CustomerDao;

@Controller
public class CustomerController {

	@Autowired
	CustomerDao dao; //will inject dao from XML file
	
	
	
	
	@RequestMapping("/AddCustomerjsp")  // Request mapping la AddCustomerjsp-> indha name should be a a jsp that we created ( views la irukum)
	public String showform(Model m)
	{
		m.addAttribute("command",new CustomerBean());
		
	      

		// command chuma oru name
		return "AddCustomerjsp";
		
	}
	@RequestMapping(value="/saveitbro",method=RequestMethod.POST)  //  value(saveitbro) has a link  with jsp of AddCustomerjsp line ni 11 in POST
	public String saveCustomers(@ModelAttribute("customerBean") CustomerBean obj)
	{
		dao.save2(obj);
		return"redirect:/viewCustomersjsp";
	}

	@RequestMapping(value="/viewCustomersjsp")
	public String viewCustomers(Model m)
	{
		List<CustomerBean> list= dao.getCustomers();
		m.addAttribute("list",list);
		return "viewCustomersjsp";
	}
	@RequestMapping(value="/deletetemp/{id}",method = RequestMethod.GET)  
	public String deletetemp(@PathVariable int id)
	{
		dao.deletetemp(id);
		return "redirect:/viewCustomersjsp";
	}
	@RequestMapping(value="/editItMan/{customerId}")
	public String editOperation(@PathVariable int customerId,Model m) // int customerId is very important
	{
		CustomerBean obj=dao.getByCustomerId(customerId) ;
		m.addAttribute("command",obj);
		return "editCustomersjsp";
	}
	@RequestMapping(value="/afterEditIwillTakeCare",method = RequestMethod.POST)
	public String afterEditsaveItMan(@ModelAttribute("obj") CustomerBean obj)
	{
		dao.update(obj);
		return "redirect:/viewCustomersjsp";
	}
}
