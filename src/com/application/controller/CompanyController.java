package com.application.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
import com.application.model.Login;
import com.application.service.BidService;
import com.application.service.BidSubService;
import com.application.service.LoginService;



@Controller
@SessionAttributes("name")
public class CompanyController {

	private String file_path = "c:Document\\";
	
	@Autowired
	private BidService bidService;
	@Autowired
	private BidSubService bidSubService;
	
	@Autowired
	private LoginService loginService;
	
	/*@RequestMapping(value="/company", method = RequestMethod.GET)
	public String login(Model model) {
		Login login = new Login();
		model.addAttribute("login",login);
		return "Company/Login";
	}*/
	@RequestMapping(value="/success",method = RequestMethod.GET)
	public ModelAndView saveprocess(Model model) {
		ModelAndView view = new ModelAndView();
		List<Bid> bids= bidService.getAllBids();
		//model.addAttribute("bidList", bids);
		view.addObject("bids", bids);
	    view.setViewName("Company/success");
		return view;
	}
	
	@RequestMapping(value="bid/{id}",method = RequestMethod.GET)
	public String bidSubmit(@PathVariable("id") int id,ModelMap model) {
		BidSub bid=new BidSub();
		Login lg=new Login();
		model.addAttribute("bid", bid);
		model.addAttribute("id",id);
		model.addAttribute("name",lg.getCName());
		
		return "Company/submission";
	}

	@RequestMapping(value="bid/saveSubBids", method = RequestMethod.POST)
	public  String saveSubBids(@ModelAttribute("bid") BidSub bid,Model model) {
		
		
		List<Bid> bids= bidService.getAllBids();
		model.addAttribute("bids",bids);
		bidSubService.SaveSubBids(bid);
		List<BidSub> bi= bidSubService.getAllSubBids();
		model.addAttribute("sub",bi);
		return "Company/success";
	}
	
	
	


	
		
		
		
		
		
		@RequestMapping(value="/")
		public String home(Model model) {
			Login login = new Login();
			model.addAttribute("login",login);
			return "Company/Login";
		}
		
		@RequestMapping(value="/check")
		public String login(Model model) {
			Login login = new Login();
			model.addAttribute("login",login);
			return "check";
		}
		
		
		@RequestMapping(value="/checkLogin")
		public ModelAndView validate(@ModelAttribute("login") Login login,ModelMap model) {
			boolean result=loginService.validUser(login);
			
			if(result){
				
				String name=login.getUsername();
				String cname=login.getCName();
				
				
				model.addAttribute("name",name);
				model.addAttribute("cname",cname);
				
				
				return new ModelAndView("redirect:/success", model);
			}else{
				
				return new ModelAndView("redirect:/");
			}	
		}
		
		@RequestMapping(value="/validate")
		public String success(@ModelAttribute("login") Login login) {
			boolean result=loginService.validUser(login);
			
			if(result){
				
				return "success";
			}else{
				return "redirect:check";
			}	
		}
		@RequestMapping(value="/savelogin")
		public String saveprocess(@ModelAttribute("login") Login login) {
			loginService.saveUsers(login);
			return "ListUsers";
		}
		
		@RequestMapping(value="/listusers")
		public String getAllUsers(Model model) {
			List<Login> listOfUsers = loginService.getAllUsers();
			
			model.addAttribute("TheUsers", listOfUsers);
			return "ListUsers";
		}
		
		@RequestMapping(value="download1/{id}", method = RequestMethod.GET)
		   public ResponseEntity<InputStreamResource> downloadFile1(@PathVariable("id") String fname) throws IOException {
				
			file_path = "C:\\Users\\keesan\\Documents\\" + fname + ".pdf";
		      File file = new File(file_path);
		      InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

		      return ResponseEntity.ok()
		            .header(HttpHeaders.CONTENT_DISPOSITION,
		                  "attachment;filename=" + file.getName())
		            .contentType(MediaType.APPLICATION_PDF).contentLength(file.length())
		            .body(resource);
		   }
		
		

	}
	

