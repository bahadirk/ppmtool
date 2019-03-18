package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Project;
import com.example.demo.repositories.IProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private IProjectRepository projectRepository;

	public Project saveOrUpdatePoject(Project project) {

		// Logic

		return projectRepository.save(project);
	}
}
