package jmr.sb.kanbanbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmr.sb.kanbanbackend.domain.Project;
import jmr.sb.kanbanbackend.repository.ProjectRepository;

@Service
public class ProjectService
{
	@Autowired
	ProjectRepository projectRepository;
	
	public Project saveOrUpdate(Project project)
	{		
		return projectRepository.save(project);
	}
}
