package com.umapathy.demo.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.umapathy.demo.serviceImpl.AppointmentServiceImpl;
@Controller
public class AppointmentWebController 
{
	
	@Autowired
	AppointmentServiceImpl appointmentServiceImpl;
	
	
//------------------------To view appointment list-----------------------------------------------	
	
	@GetMapping("/appointmentlist")
	public String  viewAppointment(Model model ) 
	{
		model.addAttribute("key1",appointmentServiceImpl.view());
		return "appointmentlist";
	}
	
//------------------------To ADD appointment  list-----------------------------------------------

	@GetMapping("/addAppointment")
	public String  addAppointment() 
	{
		return "addAppointment";
	}
	
//------------------------To update appointment list-----------------------------------------------	
	
	@GetMapping("/updateAppointment")
	public String  updateAppointment()
	{
		return "updateAppointment";
	}
}
