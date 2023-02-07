package com.example.diagsys.Service;

import com.example.diagsys.Model.Doctor;
import com.example.diagsys.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public List<Doctor> getDoctors() {
        return this.doctorRepository.findAll();
    }

    public Doctor addDoctor(Doctor doctor) {
        return this.doctorRepository.save(doctor);
    }

}
