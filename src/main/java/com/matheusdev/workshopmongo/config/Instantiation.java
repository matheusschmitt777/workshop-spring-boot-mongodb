package com.matheusdev.workshopmongo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.matheusdev.workshopmongo.dto.AuthorDTO;
import com.matheusdev.workshopmongo.entities.Post;
import com.matheusdev.workshopmongo.entities.User;
import com.matheusdev.workshopmongo.repository.PostRepository;
import com.matheusdev.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postReposiroty;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		postReposiroty.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null,  Instant.parse("2023-05-20T19:53:07Z"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", new AuthorDTO(maria));
		Post post2 = new Post(null, Instant.parse("2023-06-21T03:42:10Z"), "Bom dia", "Acordei feliz hoje!", new AuthorDTO(maria));
		
		postReposiroty.saveAll(Arrays.asList(post1, post2));
	}
}
