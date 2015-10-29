package domain.contract.model;

import java.time.LocalDate;

import domain.club.model.Club;
import domain.player.model.Player;

public class Contract {

	private LocalDate from;
	private LocalDate to;
	private Player player;
	private Club club;
}
