package gr.ekt.cerif.services.link.result;

import gr.ekt.cerif.entities.link.result.ResultPublication_Medium;
import gr.ekt.cerif.entities.result.ResultPublication;
import gr.ekt.cerif.entities.second.Medium;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LinkResultPublicationMediumRepositoryImpl implements LinkResultPublicationMediumRepository {
	
	private static final Logger log = LoggerFactory.getLogger(LinkResultPublicationMediumRepositoryImpl.class);
	
	@Autowired
	private LinkResultPublicationMediumCrudRepository linkResultPublicationMediumCrudRepository;
	

	@Transactional
	public ResultPublication_Medium save(ResultPublication_Medium entity) {
		return linkResultPublicationMediumCrudRepository.save(entity);
	}
	
	@Transactional
	public Iterable<ResultPublication_Medium> save(Iterable<ResultPublication_Medium> entityList) {
		return linkResultPublicationMediumCrudRepository.save(entityList);
	}
	

	@Transactional
	public void delete(ResultPublication_Medium entity) {
		linkResultPublicationMediumCrudRepository.delete(entity);
	}
	
	@Transactional
	public void delete(Iterable<ResultPublication_Medium> entityList) {
		linkResultPublicationMediumCrudRepository.delete(entityList);
	}
	
	@Override
	public List<ResultPublication_Medium> findByResultPublication(ResultPublication resultPublication) {
		return linkResultPublicationMediumCrudRepository.findByResultPublication(resultPublication);
	}

	@Override
	public List<ResultPublication_Medium> finfByResPubId(Long respubId) {
		return linkResultPublicationMediumCrudRepository.finfByResPubId(respubId);
	}

	@Override
	public ResultPublication_Medium findById(Long mediumrespubId) {
		return linkResultPublicationMediumCrudRepository.findById(mediumrespubId);
	}

	@Override
	public List<ResultPublication_Medium> findByMediumId(Long mediumId) {
		return linkResultPublicationMediumCrudRepository.findByMediumId(mediumId);
	}

	@Override
	public List<ResultPublication_Medium> findByMediumIdAndResPublIdAndClassUri(Long mediumId, Long resPublId, String classUri) {
		return linkResultPublicationMediumCrudRepository.findByMediumIdAndResPublIdAndClassUri(mediumId, resPublId, classUri);
	}

	@Override
	public List<ResultPublication_Medium> findByMediumUriAndMediumMimeTypeAndResPublIdAndClassUri(
			String mediumUri, String mediumMimeType, Long resPublId,
			String classUri) {
		return linkResultPublicationMediumCrudRepository.findByMediumUriAndMediumMimeTypeAndResPublIdAndClassUri(mediumUri, mediumMimeType, resPublId, classUri);
	}

	@Override
	public List<ResultPublication_Medium> findByMedium(Medium medium) {
		return linkResultPublicationMediumCrudRepository.findByMedium(medium);
	}
}
