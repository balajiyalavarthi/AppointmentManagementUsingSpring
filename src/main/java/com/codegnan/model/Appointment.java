package com.codegnan.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "appointments")
public class Appointment {
	
	private Long appointment_id;  //pk
	private Date appointment_date;
	private String status;
	private int user_id;         //fk
	private int doctor_id;      //fk
	
}
