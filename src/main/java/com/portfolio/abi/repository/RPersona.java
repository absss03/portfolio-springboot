package com.portfolio.abi.repository;

import com.portfolio.abi.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RPersona extends JpaRepository <Persona, Integer>{
    
}
