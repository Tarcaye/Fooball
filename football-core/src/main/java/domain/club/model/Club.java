package domain.club.model;

import java.time.LocalDate;
import java.util.Set;

import lombok.Builder;
import domain.contract.model.Contract;

@Builder
public class Club {

	private String name;

	private String logoUrl;

	private LocalDate createdAt;

	private Set<Contract> contracts;

}
