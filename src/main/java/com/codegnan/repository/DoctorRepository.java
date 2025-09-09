package com.codegnan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegnan.model.Doctor;
import com.codegnan.model.User;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{
	public Doctor findDoctorByEmail(String email);
}
