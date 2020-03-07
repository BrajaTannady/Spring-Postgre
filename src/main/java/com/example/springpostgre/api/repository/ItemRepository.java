package com.example.springpostgre.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springpostgre.api.model.Item;

public interface ItemRepository extends JpaRepository<Item, String>{

}
