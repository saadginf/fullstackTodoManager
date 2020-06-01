package com.saad.todomanager.web;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import com.saad.todomanager.modals.Project;
import com.saad.todomanager.services.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("api/project")
public class ProjectController {

    @Autowired
    ProjectService pService;

    @PostMapping("")
    public ResponseEntity<Project> createNewProject(@Valid @RequestBody Project project){
        Project p = pService.addProject(project);
        return new ResponseEntity<Project>(p, HttpStatus.CREATED);
       
    }
    
}