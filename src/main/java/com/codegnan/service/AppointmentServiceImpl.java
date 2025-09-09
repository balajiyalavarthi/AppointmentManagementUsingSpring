package com.codegnan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegnan.exceptions.InvalidAppoinmentException;
import com.codegnan.model.Appointment;
import com.codegnan.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	private AppointmentRepository repo;
	
	@Override
	public Appointment saveApponintment(Appointment appointment) {
		return repo.save(appointment);
	}

	@Override
	public Optional<Appointment> findAppointmentById(Long id) throws InvalidAppoinmentException {
		Optional<Appointment> appointment = repo.findById(id);
		if(appointment.isPresent()) {
			return appointment;
		}else {
			throw new InvalidAppoinmentException("Appointment with id :"+id+" not exists");
		}
	}

	@Override
	public List<Appointment> viewAllAppointments() {
		return repo.findAll();
	}

	@Override
	public void deleteAppointmentByID(Long id) throws InvalidAppoinmentException{
		Appointment appointment = repo.findById(id).orElse(null);
		
		if(appointment != null){
			repo.delete(appointment);
		}else {
			throw new InvalidAppoinmentException("Appointment with id :"+id+" not exists to delete");
		}
	}

}
