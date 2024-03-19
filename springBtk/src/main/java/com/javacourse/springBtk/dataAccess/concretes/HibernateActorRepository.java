package com.javacourse.springBtk.dataAccess.concretes;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.springBtk.dataAccess.abstracts.ActorRepository;
import com.javacourse.springBtk.entities.concretes.Actor;

import jakarta.persistence.EntityManager;



@Repository
public class HibernateActorRepository implements ActorRepository{
	private EntityManager entityManager;
	
	@Autowired
	public HibernateActorRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Actor> getAll() {
		
		Session session = entityManager.unwrap(Session.class);
		List<Actor> actors = session.createQuery("from Actor",Actor.class).list();
		return actors;
	}

	@Override
	public void add(Actor actor) {
		
		Session session = entityManager.unwrap(Session.class);
		session.persist(actor);
		
	}

	@Override
	public void update(Actor actor) {
		
		Session session = entityManager.unwrap(Session.class);
		session.merge(actor);
		
	}

	@Override
	public void delete(Actor actor) {
		
		Session session = entityManager.unwrap(Session.class);
		session.remove(actor);
		
	}

	@Override
	public Actor getById(int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Actor actor=session.get(Actor.class, id);
		return actor;
	}

}
