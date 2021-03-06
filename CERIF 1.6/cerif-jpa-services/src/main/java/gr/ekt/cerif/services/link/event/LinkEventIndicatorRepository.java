package gr.ekt.cerif.services.link.event;

import java.util.List;

import gr.ekt.cerif.entities.link.Event_Indicator;
import gr.ekt.cerif.entities.second.Event;
import gr.ekt.cerif.entities.second.Indicator;

/**
 * A repository for links between events and indicators.
 * 
 */
public interface LinkEventIndicatorRepository {

	public void delete(Event_Indicator entity); 
	
	public void delete(Iterable<Event_Indicator> entities); 

	public Iterable<Event_Indicator> save(Iterable<Event_Indicator> entities); 
	
	public Event_Indicator save(Event_Indicator entity);
	
	List<Event_Indicator> findByEvent(Event event);
	
	List<Event_Indicator> findByIndicator(Indicator indicator);
	
}
