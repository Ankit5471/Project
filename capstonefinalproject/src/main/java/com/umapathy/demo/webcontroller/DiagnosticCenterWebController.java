package com.umapathy.demo.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.umapathy.demo.model.DiagnosticCenter;
import com.umapathy.demo.serviceImpl.DiagnosticCenterServiceImpl;

@Controller
public class DiagnosticCenterWebController 
{
	
	@Autowired
	DiagnosticCenterServiceImpl diagnosticCenterServiceImpl;
	
//---------------------------To add a centers----------------------------------------------------
/*	@GetMapping("/addCenter")
	public String addCenter(Model model){
		DiagnosticCenter diagnosticCenter=new DiagnosticCenter();
		model.addAttribute("ackey",diagnosticCenter);
	return "addCenter";
	}
	
	@PostMapping("/saveCenter")
	public String saveDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		diagnosticCenterServiceImpl.addCenter(diagnosticCenter);
		return "redirect:/addCenter";
	}*/
	

	@GetMapping("/addCenter") // load empty cab form
	public String addc(Model model, DiagnosticCenter diagnosticCenter )
	{
		try {
			model.addAttribute("addcenterkey", diagnosticCenter);
			return "addCenter";
		} catch (Exception e) {
			e.printStackTrace();
			return "something went Wrong";
		}
	}

	@PostMapping("/saveCenter") // save cab
	public String saveCenter(Model model, DiagnosticCenter diagnosticCenter)
	{
		try {
			diagnosticCenterServiceImpl.addCenter(diagnosticCenter);
			return "redirect:/addCenter";
		} catch (Exception e) {
			e.printStackTrace();
			return "something wrong data enter";
		}
	}
	

	//---------------------To view the list of centers-----------------------------------
	@GetMapping("/center")
	public String  viewcenter(Model model ) {
		model.addAttribute("key1",diagnosticCenterServiceImpl.showCenters());
		return "center";
	}
	//---------------------To update the list of centers-----------------------------------
	@GetMapping("/updateCenter")
	public String updateCenter(){
	return "updateCenter";
	}
	
}
