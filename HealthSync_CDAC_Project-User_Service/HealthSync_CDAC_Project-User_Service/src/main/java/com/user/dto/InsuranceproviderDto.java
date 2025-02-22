package com.user.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InsuranceproviderDto {
	private Long id;
	private String companyName;
	private long contactNumber;
	private String email;
	private String address;
}
