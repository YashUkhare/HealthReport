package com.medical.dto;



import com.medical.entities.Gender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PatientDto {
	private Long id;
	private String firstName;
	private String lastName;
	private Gender geneder;
	private long contactNumber;
	private String email;
}
