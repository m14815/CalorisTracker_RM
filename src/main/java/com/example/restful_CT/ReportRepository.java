package com.example.restful_CT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "report", path = "report")
public interface ReportRepository extends JpaRepository<Report, Long> {
}
