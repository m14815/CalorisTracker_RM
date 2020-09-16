package com.example.restful_CT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "consumption", path = "consumption")
public interface ConsumptionRepository extends JpaRepository<Consumption,Long> {
}
