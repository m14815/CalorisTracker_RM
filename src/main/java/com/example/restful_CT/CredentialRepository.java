package com.example.restful_CT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "credential", path = "credential")
public interface CredentialRepository extends JpaRepository<Credential,Long> {

}
