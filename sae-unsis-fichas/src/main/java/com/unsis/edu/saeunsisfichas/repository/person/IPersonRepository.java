package com.unsis.edu.saeunsisfichas.repository.person;

import com.unsis.edu.saeunsisfichas.model.person.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<PersonModel, String> { }
