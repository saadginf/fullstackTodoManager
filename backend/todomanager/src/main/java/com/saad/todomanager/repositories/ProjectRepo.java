package com.saad.todomanager.repositories;

import com.saad.todomanager.modals.Project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends CrudRepository<Project,Long>{
    
}