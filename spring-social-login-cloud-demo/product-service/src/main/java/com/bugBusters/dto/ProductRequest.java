package com.bugBusters.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ProductRequest {
	@NotBlank
	private String name;
	@NotBlank
	private String version;
	private String edition;
	@NotBlank
	private String description;
	private LocalDate validFrom;
}
