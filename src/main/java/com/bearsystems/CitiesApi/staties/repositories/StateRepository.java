package com.bearsystems.CitiesApi.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bearsystems.CitiesApi.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
