package com.example.dockerdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@GetMapping
	public @ResponseBody List<Movie> getMovies() {
		Movie m1 = new Movie();
		m1.setId(1);
		m1.setNome("Os Miseráveis");
		m1.setGenero("Musical");
		
		Movie m2 = new Movie();
		m2.setId(2);
		m2.setNome("Vingadores");
		m2.setGenero("Ação");
		
		Movie m3 = new Movie();
		m3.setId(3);
		m3.setNome("A Origem");
		m3.setGenero("Suspense");
		
		return Arrays.asList(m1, m2, m3);
	}
	
	
}
