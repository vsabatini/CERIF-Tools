package gr.ekt.cerif.services.additional;

import gr.ekt.cerif.features.additional.DublinCoreDate;

import org.springframework.data.repository.CrudRepository;

@Deprecated
public interface DublinCoreDateCrudRepository extends CrudRepository<DublinCoreDate, Long> {

}
