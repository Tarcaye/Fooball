package domain.player.model;

import java.time.LocalDate;
import java.time.Period;

import lombok.Builder;
import domain.contract.model.Contract;

@Builder
public class Player {

	private String lastName;

	private String firstName;

	private String surName;

	private LocalDate birthDate;

	private String nationality;

	private Contract contract;

	public int getAge() {
		return Period.between(birthDate, LocalDate.now()).getYears();

	}

}
