package player;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/players")
public class PlayerResource {

	@RequestMapping(value = "/", method = GET)
	//	public Collection<Player> list() {
	public String list() {
		//TODO
		return "Hello muzer focking Wurld";
	}

}
