package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.AttributeMaster;



@Repository
@Transactional
public interface AttributeMasterRepository extends JpaRepository<AttributeMaster,Long> 
{
//	@Modifying
//	@Query("update atribute_master a set a.attribute_desc =:  where a.attribute_id = :id")
//	void update(@Param("desc") String attributeDesc, @Param("id") Long id);
}