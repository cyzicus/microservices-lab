package com.cyzicus;

import com.cyzicus.data.entity.PlayerEntity;
import com.cyzicus.data.repo.TeamRepository;
import com.cyzicus.data.entity.TeamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class MicroservicesLabApplication {

	@Autowired
	TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesLabApplication.class, args);
	}

	@PostConstruct
	public void init() {

		PlayerEntity fred = PlayerEntity.builder().name("Fred").position("Pitcher").build();
		PlayerEntity daphne = PlayerEntity.builder().name("Daphne").position("Catcher").build();
		PlayerEntity velma = PlayerEntity.builder().name("Velma").position("Shortstop").build();
		PlayerEntity shaggy = PlayerEntity.builder().name("Shaggy").position("Outfielder").build();
		PlayerEntity scooby = PlayerEntity.builder().name("Scooby").position("Mascot").build();
		PlayerEntity scrappy = PlayerEntity.builder().name("Scrappy").position("Mascot").build();

		Set<PlayerEntity> globetrotters = new HashSet<>();
		globetrotters.add(fred);
		globetrotters.add(daphne);
		globetrotters.add(scrappy);

		Set<PlayerEntity> generals = new HashSet<>();
		generals.add(shaggy);
		generals.add(velma);
		generals.add(scooby);

		List<TeamEntity> teamEntities = Arrays.asList(
				TeamEntity.builder()
						.name("Globetrotters")
						.location("Harlem")
						.players(globetrotters)
						.build(),
				TeamEntity.builder()
						.name("Generals")
						.location("Washington")
						.players(generals)
						.build()
		);

		teamRepository.save(teamEntities);
	}

}
