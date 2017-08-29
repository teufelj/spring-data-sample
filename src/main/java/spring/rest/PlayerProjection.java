package spring.rest;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "jointeam", types = Player.class)
public interface PlayerProjection {
    long getId();
    String getFirstName();
    String getLastName();
    Team getTeam();
}
