package com.matthewcasperson.elidetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matthewcasperson.elidetest.data.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Integer>{

}
