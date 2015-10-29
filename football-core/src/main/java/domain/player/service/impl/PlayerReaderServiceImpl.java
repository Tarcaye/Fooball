package domain.player.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.player.factory.PlayerFactory;
import domain.player.model.Player;
import domain.player.service.PlayerReaderService;
import static java.util.Arrays.asList;

@Service
public class PlayerReaderServiceImpl implements PlayerReaderService {

	@Autowired
	private PlayerFactory playerFactory;

	@Override
	public Collection<Player> getPlayers() {
		return asList(playerFactory.createPlayer());
	}
}
