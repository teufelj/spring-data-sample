package spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Configuration
    @EnableJpaAuditing
    static class RepositoryRestConfig extends RepositoryRestConfigurerAdapter {

        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
            config.exposeIdsFor(Team.class, Player.class);
        }
    }
    
    @Component
    static class DatabaseLoder implements CommandLineRunner {
        @Autowired
        private TeamRepository teamRepository;
        @Autowired
        private PlayerRepository personRepository;

        @Override
        public void run(String... strings) throws Exception {
            Team t = new Team();
            t.setTeamName("Team Sky");
            teamRepository.save(t);
            
            Player p = new Player();
            p.setFirstName("Christpher");
            p.setLastName("Froome");
            p.setTeam(t);
            personRepository.save(p);
        }
        
    }
}
