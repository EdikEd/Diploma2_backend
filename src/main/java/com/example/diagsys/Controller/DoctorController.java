package com.example.diagsys.Controller;

import com.example.diagsys.Model.Doctor;
import com.example.diagsys.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctors")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping
    List<Doctor> getDoctors() {
        return this.doctorService.getDoctors();
    }

    @PostMapping
    Doctor addDoctor(@RequestBody Doctor doctor) {
        return this.doctorService.addDoctor(doctor);
    }
}
