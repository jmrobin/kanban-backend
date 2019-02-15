package jmr.sb.kanbanbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jmr.sb.kanbanbackend.domain.Project;
import jmr.sb.kanbanbackend.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController
{
	@Autowired
	private ProjectService projectService;
	
	@PostMapping
	public ResponseEntity<Project> create(@RequestBody Project project)
	{
		return new ResponseEntity<Project>(
				projectService.saveOrUpdate(project),
				HttpStatus.CREATED);
	}
}
