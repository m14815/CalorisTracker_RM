package com.example.restful_CT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "food", path = "food")
public interface FoodRepository extends JpaRepository<Food, Long> {
}
