package domain.player.model;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PlayerTest {

	Player player;

	@Test
	public void testGetAge() {

		LocalDate birthDate = LocalDate.of(1985, 11, 20);
		player = Player.builder().birthDate(birthDate).build();

		int result = player.getAge();

		Assertions.assertThat(result).isEqualTo(29);
	}
}
