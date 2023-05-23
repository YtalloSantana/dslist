package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.devsuperior.dslist.dto.GameMinDTO;
=======
>>>>>>> 5ef03c0c1c9112a231fb273ecb98310cb717e8d6
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;

@RestController

<<<<<<< HEAD
@RequestMapping( value= "/games")
public class GameController {

	@Autowired

	private GameService gameService; 
	
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		
		List<GameMinDTO> result=gameService.findAll();
		
		return result  ;
		
		
		
=======
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping
	public List<Game> findAll() {

		List<Game> result = gameService.findAll();

		return result;

>>>>>>> 5ef03c0c1c9112a231fb273ecb98310cb717e8d6
	}
}
