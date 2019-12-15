package org.ghoul.dao;

import org.ghoul.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
 
 
@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<Company, Long>{
					
}
