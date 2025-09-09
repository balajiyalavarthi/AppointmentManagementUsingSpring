package com.codegnan.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")

public class Doctor {

	private Long doctor_id;    //pk
	private String name;
	private String specialization;
	private String email;
	private String phone;
}
