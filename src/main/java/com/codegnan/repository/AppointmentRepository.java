package com.codegnan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegnan.model.Appointment;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

}
