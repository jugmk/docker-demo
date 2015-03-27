package mk.jug.demo.sbp.service;

import mk.jug.demo.sbp.domain.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by tdelev on 22.3.15.
 */
@RepositoryRestResource(path = "events", collectionResourceRel = "events")
public interface EventsRepository extends PagingAndSortingRepository<Event, Long> {
  Page<Event> findByName(String name, Pageable pageable);
}
