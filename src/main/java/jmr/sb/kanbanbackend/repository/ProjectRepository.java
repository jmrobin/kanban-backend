package jmr.sb.kanbanbackend.repository;

import org.springframework.data.repository.CrudRepository;

import jmr.sb.kanbanbackend.domain.Project;

public interface ProjectRepository extends CrudRepository<Long, Project>
{

}