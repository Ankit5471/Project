package com.umapathy.demo.webcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.umapathy.demo.model.Appointment;
import com.umapathy.demo.model.Patient;
import com.umapathy.demo.serviceImpl.PatientServiceImpl;

@Controller
public class PatientWebController {
	@Autowired
	PatientServiceImpl patientServiceImpl;
	

	
//------------------------To view patient list-----------------------------------------------
	@GetMapping("/patientlist")
	public String  viwePatient(Model model) {
		model.addAttribute("key1",patientServiceImpl.view());
		return "patientlist";
	}
//------------------------To add patient list------------------------------------------------
	@PostMapping("/addPatient")
	public String  addpatient(Model model) {
		Patient patient=new Patient();
		Appointment appoint=new Appointment();
		patient.addAppointment(appoint);
		model.addAttribute("addPatientRef", patient);
		model.addAttribute("appoint2", appoint);
		return "addPatient";
	
	}
	@PostMapping("/savePatient")
	public String addPatient(@ModelAttribute("patient") Patient patient) {
        patientServiceImpl.register(patient);
		return "redirect:/patientlist";
	}
//	
//	@PostMapping("/savePatient") 
//	public String savedata(Model model, Patient patient) {
//		patientServiceImpl.register(patient);
//			return "redirect:/addPatient";
//	}	
//	
//------------------------To update patient list---------------------------------------------
	@GetMapping("/updatePatient")
	public String  updatePatient() {
		return "updatePatient";
	}
	
//------------------------To delete patient list---------------------------------------------
}



