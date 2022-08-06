package com.Argprog.porfolio.repository;

import com.Argprog.porfolio.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends JpaRepository <Skills, Long>{
	
}
