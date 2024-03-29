package com.javacourse.springBtk.dataAccess.abstracts;

import java.util.List;

import com.javacourse.springBtk.entities.concretes.Actor;

public interface ActorRepository {
	List<Actor> getAll();
	void add(Actor actor);
	void update(Actor actor);
	void delete(Actor actor);
	Actor getById(int id);

}
