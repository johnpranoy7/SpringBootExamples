package com.telusko.Exp4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.telusko.Exp4.entities.Alien;

/* 
 * Note that your naming of functions should use same name of variables in bean class
 * Only few things like greater than, less than are understood by JPARepo.
 * You can also write custom queries using @query. note that select * is removed as it is boiler plate
 * also note that ? is given numbering to match our functions parameters
 * */
@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
public interface AlienDao extends JpaRepository<Alien, Integer>{
	
//	public List<Alien> findByTech(String tech);
//
//	public List<Alien> findBySidGreaterThan(int sid);
//	
//	@Query("from Alien where tech=?1 order by sname")
//	public List<Alien> findByTechSorted(String tech);
 }
