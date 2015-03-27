package mk.jug.demo.sbp.service;

import mk.jug.demo.sbp.domain.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by tdelev on 22.3.15.
 */
@RepositoryRestResource(path = "participants", collectionResourceRel = "participants")
public interface ParticipantsRepository
  extends PagingAndSortingRepository<Participant, Long> {

}
