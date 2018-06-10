package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entity.QueryEntity;
import com.service.QueryService;

@Controller
public class QueryController {
	@Autowired
	private QueryService queryservice;

	
	
	@RequestMapping(value={ "/Rest/Queryregister" }, method=RequestMethod.GET)
	public ModelAndView QueryRegister(){
		ModelAndView model;
		model = new ModelAndView("Queryregister");
		return model;

}
	@RequestMapping(value={"/Rest/Queryprocess"}, method=RequestMethod.POST )
	public @ResponseBody  boolean Registerprocess (@RequestBody QueryEntity query){
		boolean query1=queryservice.QueryRequest(query); 
		
queryservice.SupportsendMail(query);		
		System.out.println("mail sent for support");
		
		  
if(query.getEmail()!=null&& query.getName()!=null&& query.getQueryMessage()!=null&&query.getSubject()!=null)		
{
queryservice.sendMail("abc@gmail.com", query,"abc@gmail.com", "Regarding your query send", "thanks for your concern!!!"
		+ "Our concerned person would contact you ASAP");
	System.out.println("mail sent");
              return true;
		  } 
        else{
              return false;
        }

	}
}
