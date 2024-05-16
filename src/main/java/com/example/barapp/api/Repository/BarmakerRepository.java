package com.example.barapp.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.barapp.api.model.Barmaker;

public interface BarmakerRepository extends JpaRepository<Barmaker, Integer> {
}
