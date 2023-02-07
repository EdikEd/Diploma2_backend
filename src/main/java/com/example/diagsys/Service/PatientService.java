package com.example.diagsys.Service;


import com.example.diagsys.Model.Patient;
import com.example.diagsys.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public List<Patient> getPatients() {
        return this.patientRepository.findAll();
    }

    public Patient addPatient(Patient patient) {
        return this.patientRepository.save(patient);
    }

}
