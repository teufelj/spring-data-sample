package spring.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "team", path = "team")
public interface TeamRepository extends JpaRepository<Team, Long>{
    Team findByTeamNameContains(@Param("teamName") String teamName);
}
