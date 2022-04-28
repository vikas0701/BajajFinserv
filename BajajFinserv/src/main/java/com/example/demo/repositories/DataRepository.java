package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Integer> {

}
