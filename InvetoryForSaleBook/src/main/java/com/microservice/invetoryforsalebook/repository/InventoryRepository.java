package com.microservice.invetoryforsalebook.repository;

import com.microservice.invetoryforsalebook.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, UUID>{

}
