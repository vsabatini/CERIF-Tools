package gr.ekt.cerif.services.link.organisationunit;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gr.ekt.cerif.entities.base.OrganisationUnit;
import gr.ekt.cerif.entities.link.organisationunit.OrganisationUnit_Event;
import gr.ekt.cerif.entities.second.Event;

@Component
public class LinkOrganisationUnitEventRepositoryImpl implements
		LinkOrganisationUnitEventRepository {
	
	private static final Logger log = LoggerFactory.getLogger(LinkOrganisationUnitEventRepositoryImpl.class);
	
	@Autowired
	private LinkOrganisationUnitEventCrudRepository linkOrganisationUnitEventCrudRepository;

	@Override
	public void delete(OrganisationUnit_Event entity) {
		linkOrganisationUnitEventCrudRepository.delete(entity);
	}

	@Override
	public void delete(Iterable<OrganisationUnit_Event> entities) {
		linkOrganisationUnitEventCrudRepository.delete(entities);
	}

	@Override
	public Iterable<OrganisationUnit_Event> save(
			Iterable<OrganisationUnit_Event> entities) {
		return linkOrganisationUnitEventCrudRepository.save(entities);
	}

	@Override
	public OrganisationUnit_Event save(OrganisationUnit_Event entity) {
		return linkOrganisationUnitEventCrudRepository.save(entity);
	}

	@Override
	public List<OrganisationUnit_Event> findByOrganisationUnit(
			OrganisationUnit organisationUnit) {
		return linkOrganisationUnitEventCrudRepository.findByOrganisationUnit(organisationUnit);
	}

	@Override
	public List<OrganisationUnit_Event> findByEvent(Event event) {
		return linkOrganisationUnitEventCrudRepository.findByEvent(event);
	}

}
