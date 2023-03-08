package com.example.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.Model.cloth_model;

public interface cloth_rep extends JpaRepository<cloth_model,Integer>{

}