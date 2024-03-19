package com.javacourse.springBtk.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.springBtk.business.abstracts.ActorService;
import com.javacourse.springBtk.entities.concretes.Actor;

@RestController 
@RequestMapping("/api") 
public class ActorController {
	
	
	private ActorService actorService;

	@Autowired
	public ActorController(ActorService actorService) {
		this.actorService = actorService;
	}
	@GetMapping("/actor")
	public List<Actor> get(){
		return actorService.getAll();
	}
	@PostMapping("/add")
	public void add(Actor actor) {
		actorService.add(actor);
	}
	@PostMapping("/update")
	public void update(Actor actor) {
		actorService.update(actor);
	}
	@PostMapping("/delete")
	public void delete(Actor actor) {
		actorService.delete(actor);
	}
	@GetMapping("/actor/{id}")
	public Actor getById(@PathVariable int id){
		return actorService.getById(id);
	}
				

}
