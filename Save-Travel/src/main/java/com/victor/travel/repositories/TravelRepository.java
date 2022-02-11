package com.victor.travel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.victor.travel.models.Expense;


@Repository
public interface TravelRepository extends CrudRepository <Expense, Long>{
	List<Expense> findAll();
}
