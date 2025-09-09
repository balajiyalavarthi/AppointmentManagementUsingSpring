package com.codegnan.service;

import java.util.List;
import java.util.Optional;

import com.codegnan.exceptions.InvalidDoctorException;
import com.codegnan.model.Doctor;

public interface DoctorService {
	public Doctor addDoctor(Doctor doctor);
	public List<Doctor> viewAllDoctors();
	public Optional<Doctor> findDoctorById(Long id) throws InvalidDoctorException;
	public Doctor findDoctorByEmail(String  email) throws InvalidDoctorException;
	public void deleteDoctorById(Long id) throws InvalidDoctorException;

}
