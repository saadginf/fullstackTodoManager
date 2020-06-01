package com.saad.todomanager.services;

import com.saad.todomanager.modals.Project;
import com.saad.todomanager.repositories.ProjectRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;
    

    public Project addProject(Project project){

        //Logic

        return projectRepo.save(project);

    }
}