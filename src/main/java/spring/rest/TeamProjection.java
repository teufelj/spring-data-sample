package spring.rest;

import java.util.Date;
import java.util.List;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "joinplayers", types = Team.class)
public interface TeamProjection {
    long getId();
    String getTeamName();
    Date getCreatedOn();
    Date getUpdatedOn();
    List<Player> getPlayers();
}
