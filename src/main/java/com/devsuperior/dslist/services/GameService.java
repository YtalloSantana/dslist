package com.devsuperior.dslist.services;

import java.util.List;
<<<<<<< HEAD
import java.util.stream.Collectors;
=======
>>>>>>> 5ef03c0c1c9112a231fb273ecb98310cb717e8d6

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
<<<<<<< HEAD
	public List<GameMinDTO>  findAll(){
	List<Game> result= gameRepository.findAll();
	List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());

	
		return dto;
=======
	public List< Game>  findAll(){
	List<Game> result = gameRepository.findAll();
	List< GameMinDTO> dto= result.stream().map(x -> new GameMinDTO(x)).toList();
	
		return result;
>>>>>>> 5ef03c0c1c9112a231fb273ecb98310cb717e8d6
	}
}
