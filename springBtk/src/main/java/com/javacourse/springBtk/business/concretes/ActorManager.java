package com.javacourse.springBtk.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.springBtk.business.abstracts.ActorService;
import com.javacourse.springBtk.dataAccess.abstracts.ActorRepository;
import com.javacourse.springBtk.entities.concretes.Actor;

@Service 
public class ActorManager implements ActorService{
	
	private ActorRepository actorRepository;

	@Autowired
	public ActorManager(ActorRepository actorRepository) {
		
		this.actorRepository = actorRepository;
	}

	@Override
	@Transactional
	public List<Actor> getAll() {
		// TODO Auto-generated method stub
		return this.actorRepository.getAll();
	}

	@Override
	@Transactional
	public void add(Actor actor) {
		// TODO Auto-generated method stub
		this.actorRepository.add(actor);
		
	}

	@Override
	@Transactional
	public void update(Actor actor) {
		// TODO Auto-generated method stub
		this.actorRepository.update(actor);
		
	}

	@Override
	@Transactional
	public void delete(Actor actor) {
		// TODO Auto-generated method stub
		this.actorRepository.delete(actor);
	}

	@Override
	@Transactional
	public Actor getById(int id) {
		// TODO Auto-generated method stub
		return this.actorRepository.getById(id);
	}

}
