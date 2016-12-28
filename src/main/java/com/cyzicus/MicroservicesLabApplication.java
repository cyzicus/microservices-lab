package com.cyzicus;

import com.cyzicus.data.TeamRepository;
import com.cyzicus.model.TeamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MicroservicesLabApplication {

	@Autowired
	TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesLabApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<TeamEntity> teamEntities = Arrays.asList(
				new TeamEntity(1l, "Globetrotters", "Harlem", "Globetrotters"),
				new TeamEntity(2l, "Generals", "Washington", "Generals")

		);

		teamRepository.save(teamEntities);
	}

}
