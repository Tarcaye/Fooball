package domain.player.factory.impl;

import org.springframework.stereotype.Service;

import domain.player.factory.PlayerFactory;
import domain.player.model.Player;

@Service
public class PlayerFactoryImpl implements PlayerFactory {

	@Override
	public Player createPlayer() {
		return Player.builder().lastName("De la fuente").firstName("Joel").build();
	}

}
