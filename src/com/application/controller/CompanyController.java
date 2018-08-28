package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.application.model.Bid;
import com.application.model.BidSub;
import com.application.model.CLogin;
import com.application.service.BidService;
import com.application.service.BidSubService;



@Controller
@SessionAttributes("name")
public class CompanyController {

	
	@Autowired
	private BidService bidService;
	@Autowired
	private BidSubService bidSubService;
	
	@RequestMapping(value="/company", method = RequestMethod.GET)
	public String login(Model model) {
		CLogin login = new CLogin();
		model.addAttribute("login",login);
		return "Company/Login";
	}
	@RequestMapping(value="/success",method = RequestMethod.POST)
	public ModelAndView saveprocess(Model model) {
		ModelAndView view = new ModelAndView();
		List<Bid> bids= bidService.getAllBids();
		//model.addAttribute("bidList", bids);
		view.addObject("bids", bids);
	    view.setViewName("Company/success");
		return view;
	}
	
	@RequestMapping(value="/bid/{id}",method = RequestMethod.GET)
	public String bidSubmit(@PathVariable("id") int id,ModelMap model) {
		BidSub bid=new BidSub();
		model.addAttribute("bid", bid);
		model.addAttribute("id",id);
		
		return "Company/submission";
	}

	@RequestMapping(value="bid/saveSubBids", method = RequestMethod.POST)
	public  String saveSubBids(@ModelAttribute("bid") BidSub bid,Model model) {
		
		
		List<Bid> bids= bidService.getAllBids();
		model.addAttribute("bids",bids);
		bidSubService.SaveSubBids(bid);
		
		return "Company/success";
	}
	
}
