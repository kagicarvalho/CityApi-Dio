package com.bearsystems.CitiesApi.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bearsystems.CitiesApi.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
