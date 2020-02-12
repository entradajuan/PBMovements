package com.needine.pbmovements.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.needine.pbmovements.domain.Movement;

@Repository
public interface MovementRepository extends CrudRepository<Movement, Long> {

}
