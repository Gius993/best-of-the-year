package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.classes.model.Movie;
import com.classes.model.Song;

@Controller
@RequestMapping("/")

public class MainController {

	
	@GetMapping()
	public String index(Model model) {
		String title = "Best of the year by Giuseppe";
		model.addAttribute("title", title);
		return "index";
	}

	private List<Movie> getBestMovies() {
		List<Movie> bestMovies = new ArrayList<>();
		bestMovies.add(new Movie(1, "Il sempre nato"));
		bestMovies.add(new Movie(2, "Il padrino"));
		bestMovies.add(new Movie(3, "Il padrino pt2"));
		return bestMovies;
	}

	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAttribute("movies", getBestMovies());
		return "movies";
	}
	// prendo film per id 
	

	
	private List<Song> getBestSongs() {
		List<Song> bestSongs = new ArrayList<>();
		bestSongs.add(new Song(1, "lalalaal"));
		bestSongs.add(new Song(2, "la sonatona"));
		bestSongs.add(new Song(3, "parapapa"));
		return bestSongs;
	}

	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("songs", getBestSongs());
		return "songs";
	}


}
