package com.sai.om.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sai.om.dto.MailDTO;
import com.sai.om.service.MailService;

@Controller
@RequestMapping("/")
public class MailController {
	
	@Autowired
	private MailService service;
	
	@RequestMapping(value="sendMail.do",method=RequestMethod.POST)
	public ModelAndView sendEmail(MailDTO dtoFromJSP)
	{
		System.out.println("entering the controller to send mail");
		try{
			System.out.println("start Request processing logic");
			 Boolean sent=service.sendMailFromService(dtoFromJSP);
			 if(sent)
			 {
				 System.out.println("Mail sent successfully");
				 return new ModelAndView("Success.jsp", "msg","Mail is successfully sent to"+dtoFromJSP.getReceiptent());
			 }
		}catch(Exception e){
			System.out.println("exception occured in controller"+e.getMessage());
			e.printStackTrace();
		}
		return new ModelAndView("Mail.jsp","emsg","Mail is not sent try again");
	}
      
}
