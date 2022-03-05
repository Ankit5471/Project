//package com.umapathy.demo;
//
//
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//import static org.mockito.Mockito.verify;
//
//
//
//
//import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.mockito.ArgumentCaptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//
//
//import com.umapathy.demo.model.Appointment;
//import com.umapathy.demo.model.DiagnosticCenter;
//import com.umapathy.demo.model.DiagnosticTest;
//import com.umapathy.demo.model.Patient;
//import com.umapathy.demo.model.TestResult;
//import com.umapathy.demo.repo.AppointmentRepo;
//import com.umapathy.demo.repository.AppointmentRepository;
//import com.umapathy.demo.service.DiagnosticCenterService;
//import com.umapathy.demo.serviceImpl.AppointmentServiceImpl;
//import com.umapathy.demo.serviceImpl.DiagnosticCenterServiceImpl;
//import com.umapathy.demo.serviceImpl.DiagnosticTestServiceImpl;
//import com.umapathy.demo.serviceImpl.PatientServiceImpl;
//import com.umapathy.demo.serviceImpl.TestResultServiceImpl;

//
//
//
//@SpringBootTest
////@TestMethodOrder(OrderAnnotation.class)
//class HospitalManagementApplicationTests {
//
//
//
//@Autowired
//AppointmentServiceImpl appointmentServiceImple;
//@Autowired
//PatientServiceImpl patientServiceImple;
//@Autowired
//DiagnosticCenterServiceImpl diagnosticCenterServiceImple;
//@Autowired
//DiagnosticTestServiceImpl diagnosticTestServiceImple;
//@Autowired
//TestResultServiceImpl testResultServiceImple;
//@Autowired
//DiagnosticCenterService diagnosticCenterRepository;
//@Autowired
//AppointmentRepo appointmentRepository;
//@Autowired
//AppointmentRepo appointmentService;
//
//
//@Test
//public void viewAppointments() // display
//{
//assertThat(appointmentServiceImple.viewAppointments()).isNotEqualTo(0);
//}
//
//
//
//@Test
//public void viewPatient() // display driver
//{
//assertThat(patientServiceImple.viewPatient()).isNotEqualTo(0);
//}
//
//
//
//@Test
//public void getAllTest() // display driver
//{
//assertThat(diagnosticTestServiceImple.getAllTest()).isNotEqualTo(0);
//}
//
//
//
//@Test
//public void getAllDiagnosticCenters() // display driver
//{
//assertThat(diagnosticCenterServiceImple.getAllDiagnosticCenters()).isNotEqualTo(0);
//}
//
//
//
//@Test
//public void viewResultofAllPatient() // display driver
//{
//assertThat(testResultServiceImple.viewResultofAllPatient()).isNotEqualTo(0);
//}
//
//
//
//@Test
//public void AddAppointments() {
//Appointment appointment = new Appointment();
//appointment.setAppointmentId(1);
//appointment.getAppointmentDate();
//
//
//
//Patient patient = new Patient();
//patient.setName("");
//patient.setAge(23);
//patient.setGender("male");
//patient.setPatientId(1);
//patient.setPhoneNo("7418529696");
//appointment.setPatient(patient);
//patient.setAppointment(appointment);
//assertThat(appointment.getAppointmentId()).isGreaterThan(0);
//
//
//
//DiagnosticCenter diagnosticCenter = new DiagnosticCenter();
//diagnosticCenter.setAddress("Nagpur");
//diagnosticCenter.setContactEmail("xyz@gmail.com");
//diagnosticCenter.setContactNo("741852963");
//diagnosticCenter.setDignosticId(1);
//diagnosticCenter.setName("Sk center");
//diagnosticCenter.setAppointment(appointment);
//assertThat(diagnosticCenter.getDignosticId().equals(appointment));
//
//
//
//DiagnosticTest diagnosticTest = new DiagnosticTest();
//diagnosticTest.setDiagnosticTestId(1);
//diagnosticTest.setNormalValue("4.5");
//diagnosticTest.setTestName("Sugar Test");
//diagnosticTest.setTestPrice(700.00);
//diagnosticTest.setUnits("mM");
//diagnosticTest.setAppointment(appointment);
//assertThat(diagnosticTest.getDiagnosticTestId().equals(diagnosticCenter));
//
//
//
//TestResult testResul = new TestResult();
//testResul.setConditionP("medium");
//testResul.setTestId(1);
//testResul.setTestReading(154.07);
//testResul.setAppointment(appointment);
//assertThat(testResul.getTestId().equals(appointment));
//}
































//// @Test
//// public void testDeleteAppoinment() {
////
////
////
//// Appointment appointment =createAppoinment();
//// ArgumentCaptor<Appointment> arg = ArgumentCaptor.forClass(Appointment.class);
//// appointmentService.removeAppointmentById(appointment.getAppointmentId());
//// verify(appointmentRepository).deleteById(arg.capture().getAppointmentId());
//// assertEquals("120", arg.getValue().getAppointmentId());
//// }
////
////
//// private Appointment createAppoinment() {
//// Appointment appointment=new Appointment();
//// appointment.setAppointmentId(1);
//// return appointment;
//// }
////
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//// appointmentRepository.deleteById(1);
//// assertThat(appointmentRepository.existsById(1)).isTrue();
////
//// diagnosticCenterRepository.deleteById(1);
////
//// assertThat(diagnosticCenterRepository.existsById(1)).isTrue();
////
////
//
//
//
//
//
//
//
//// Appointment appointment=diagnosticCenterRepository.deleteById(1);
//// diagnosticCenter.setDignosticId(7);;
//// diagnosticCenter.setAddress("Wardha");
////// diagnosticCenter.setContactNo("741789456");
////// diagnosticCenter.setContactEmail("qwer@gmail.com");
////// diagnosticCenter.setName("bt Center");
//// diagnosticCenterRepository.save(diagnosticCenter);
//// assertNotEquals("asd", diagnosticCenterRepository.findById(7).get().getAddress());
////
////
//// // assertThat(diagnosticCenter.getDignosticId().equals());
//
//
//
//
//
//}
