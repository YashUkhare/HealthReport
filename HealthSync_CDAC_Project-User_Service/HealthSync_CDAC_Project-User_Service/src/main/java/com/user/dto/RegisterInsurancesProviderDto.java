package com.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterInsurancesProviderDto {
	@NotBlank(message = "Company name must be supplied")
	private String companyName;
	@NotNull(message = "Contact number must be supplied")
	private long contactNumber;
	@NotBlank(message = "Email must be supplied")
	@Email(message = "Invalid Email format")
	private String email;
	@NotBlank(message = "Address must be supplied")
	private String address;
	@NotBlank(message = "Password must be supplied")
	private String password;
}
