package gr.ekt.cerif.services.link.result;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gr.ekt.cerif.entities.link.result.ResultPublication_ResultPatent;
import gr.ekt.cerif.entities.result.ResultPatent;
import gr.ekt.cerif.entities.result.ResultPublication;

@Component
public class LinkResultPublicationResultPatentRepositoryImpl implements
		LinkResultPublicationResultPatentRepository {
	
	private static final Logger log = LoggerFactory.getLogger(LinkResultPublicationResultPatentRepositoryImpl.class);
	
	@Autowired
	private LinkResultPublicationResultPatentCrudRepository linkResultPublicationResultPatentCrudRepository;

	@Override
	public void delete(ResultPublication_ResultPatent entity) {
		linkResultPublicationResultPatentCrudRepository.delete(entity);
	}

	@Override
	public void delete(Iterable<ResultPublication_ResultPatent> entities) {
		linkResultPublicationResultPatentCrudRepository.delete(entities);
	}

	@Override
	public Iterable<ResultPublication_ResultPatent> save(
			Iterable<ResultPublication_ResultPatent> entities) {
		return linkResultPublicationResultPatentCrudRepository.save(entities);
	}

	@Override
	public ResultPublication_ResultPatent save(
			ResultPublication_ResultPatent entity) {
		return linkResultPublicationResultPatentCrudRepository.save(entity);
	}

	@Override
	public List<ResultPublication_ResultPatent> findByResultPatent(
			ResultPatent resultPatent) {
		return linkResultPublicationResultPatentCrudRepository.findByResultPatent(resultPatent);
	}

	@Override
	public List<ResultPublication_ResultPatent> findByResultPublication(
			ResultPublication resultPublication) {
		return linkResultPublicationResultPatentCrudRepository.findByResultPublication(resultPublication);
	}

}
