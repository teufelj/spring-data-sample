package spring.rest;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "player", path = "player")
public interface PlayerRepository extends JpaRepository<Player, Long>{
    
    List<Player> findAllByLastNameContainsAndFirstNameContains(@Param("lastName") String lastName, @Param("firstName") String firstName, Pageable pageable);

}
