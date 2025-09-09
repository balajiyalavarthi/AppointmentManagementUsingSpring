package com.codegnan.service;

import java.util.List;
import java.util.Optional;

import com.codegnan.exceptions.InvalidAppoinmentException;
import com.codegnan.model.Appointment;

public interface AppointmentService {
	public Appointment saveApponintment(Appointment appointment);
	public Optional<Appointment> findAppointmentById(Long id) throws InvalidAppoinmentException;
	public List<Appointment> viewAllAppointments();
	public void deleteAppointmentByID(Long id)throws InvalidAppoinmentException;
}
