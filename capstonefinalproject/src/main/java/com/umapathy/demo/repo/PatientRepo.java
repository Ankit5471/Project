package com.umapathy.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umapathy.demo.model.Patient;
@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
