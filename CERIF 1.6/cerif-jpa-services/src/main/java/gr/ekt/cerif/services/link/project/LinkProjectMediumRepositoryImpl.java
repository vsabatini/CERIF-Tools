package gr.ekt.cerif.services.link.project;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gr.ekt.cerif.entities.base.Project;
import gr.ekt.cerif.entities.link.project.Project_Medium;
import gr.ekt.cerif.entities.second.Medium;

@Component
public class LinkProjectMediumRepositoryImpl implements
		LinkProjectMediumRepository {
	
	private static final Logger log = LoggerFactory.getLogger(LinkProjectMediumRepositoryImpl.class);
	
	@Autowired
	private LinkProjectMediumCrudRepository linkProjectMediumCrudRepository;

	@Override
	public void delete(Project_Medium entity) {
		linkProjectMediumCrudRepository.delete(entity);
	}

	@Override
	public void delete(Iterable<Project_Medium> entities) {
		linkProjectMediumCrudRepository.delete(entities);
	}

	@Override
	public Iterable<Project_Medium> save(Iterable<Project_Medium> entities) {
		return linkProjectMediumCrudRepository.save(entities);
	}

	@Override
	public Project_Medium save(Project_Medium entity) {
		return linkProjectMediumCrudRepository.save(entity);
	}

	@Override
	public List<Project_Medium> findByProject(Project project) {
		return linkProjectMediumCrudRepository.findByProject(project);
	}

	@Override
	public List<Project_Medium> findByMedium(Medium medium) {
		return linkProjectMediumCrudRepository.findByMedium(medium);
	}

}
