package com.portfolio.abi.repository;

import com.portfolio.abi.entity.Stack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RStack extends JpaRepository <Stack, Integer>{
    
}