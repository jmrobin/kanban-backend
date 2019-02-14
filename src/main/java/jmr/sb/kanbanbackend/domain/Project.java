package jmr.sb.kanbanbackend.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Project
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String identifier;
	
	private String description;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private LocalDateTime createdDate;
	
	private LocalDateTime updatedDate;
	
	@PrePersist
	protected void onCreate()
	{
		this.createdDate = LocalDateTime.now();
	}
	
	@PreUpdate
	protected void onUpdate()
	{
		this.updatedDate = LocalDateTime.now();
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getIdentifier()
	{
		return identifier;
	}

	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public LocalDateTime getStartDate()
	{
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate)
	{
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate()
	{
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate)
	{
		this.endDate = endDate;
	}

	public LocalDateTime getCreatedDate()
	{
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate)
	{
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate()
	{
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate)
	{
		this.updatedDate = updatedDate;
	}
}
