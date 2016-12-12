package org.selflearn.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.selflearn.model.Compte;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CompteImpl implements EntityRepository<Compte> {
	@PersistenceContext
	private EntityManager em;

	public Compte save(Compte t) {
		em.persist(t);
		return t;
	}

	public List<Compte> findAll() {
		Query qu = em.createQuery("select c from Compte c");
		return qu.getResultList();
	}

	public List<Compte> findByIntitule(String intitule) {
		Query qu = em.createQuery("select c from Compte c where c.intitule like :x");
		em.setProperty("x", intitule);
		return qu.getResultList();
	}

	public Compte findOne(Long id) {
		Compte compte = em.find(Compte.class, id);
		return compte;
	}

	public Compte update(Compte t) {
		em.merge(t);
		return t;
	}

	public void delete(Long id) {
		em.remove(findOne(id));

	}

}
