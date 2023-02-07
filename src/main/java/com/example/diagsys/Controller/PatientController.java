package com.example.diagsys.Controller;


import com.example.diagsys.Model.Doctor;
import com.example.diagsys.Model.Patient;
import com.example.diagsys.Service.DoctorService;
import com.example.diagsys.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patients")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping
    List<Patient> getPatients() {
        return this.patientService.getPatients();
    }

    @PostMapping
    Patient addPatient(@RequestBody Patient patient) {
        return this.patientService.addPatient(patient);
    }

}
