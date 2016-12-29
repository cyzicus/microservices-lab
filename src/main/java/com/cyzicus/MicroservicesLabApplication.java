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
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

		List<TeamEntity> teamEntities = Arrays.asList(
				TeamEntity.builder()
						.name("Globetrotters")
						.location("Harlem")
						.players(Stream.of(fred, daphne, scrappy).collect(Collectors.toSet()))
						.build(),
				TeamEntity.builder()
						.name("Generals")
						.location("Washington")
						.players(Stream.of(shaggy, velma, scooby).collect(Collectors.toSet()))
						.build()
		);

		teamRepository.save(teamEntities);
	}

}
