package org.selflearn.dao;

import java.util.List;

public interface EntityRepository<T> {
	public T save(T t);

	public List<T> findAll();

	public List<T> findByIntitule(String intitule);

	public T findOne(Long id);

	public T update(T t);

	public void delete(Long id);

}
