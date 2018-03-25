package gov.wilaya.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gov.wilaya.entities.Division;

public interface DivisionRepository extends JpaRepository<Division, Long> {

}
