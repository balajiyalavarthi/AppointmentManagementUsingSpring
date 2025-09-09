package com.codegnan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegnan.exceptions.InvalidDoctorException;
import com.codegnan.model.Doctor;
import com.codegnan.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorRepository repo;
	@Override
	public Doctor addDoctor(Doctor doctor) {	
		return repo.save(doctor);
	}

	@Override
	public List<Doctor> viewAllDoctors() {
		return repo.findAll();
	}

	@Override
	public Optional<Doctor> findDoctorById(Long id) throws InvalidDoctorException {
		Optional<Doctor> doctor = repo.findById(id);
		
		if(doctor.isPresent()) {
			
			return doctor;
		}else {
			throw new InvalidDoctorException("Doctor with id : "+id+" is not found");
		}
	}

	@Override
	public Doctor findDoctorByEmail(String email) throws InvalidDoctorException {
		
		return repo.findDoctorByEmail(email);
	}

	@Override
	public void deleteDoctorById(Long id) throws InvalidDoctorException {
		Doctor doctor = repo.findById(id).orElse(null);
		
		if(doctor != null) {
			repo.delete(doctor);
		}else {
			throw new InvalidDoctorException("Doctor with id : "+id+" not found to delete");
		}
		
	}

}
