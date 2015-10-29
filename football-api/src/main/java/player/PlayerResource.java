package player;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.player.model.Player;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/players")
public class PlayerResource {

	@RequestMapping(value = "/", method = GET)
	public Collection<Player> list() {
		//TODO
		return null;
	}

}
