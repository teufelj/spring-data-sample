# Sample for Using @RepositoryRestResource

Accessing JPA Data with REST

## POST

### Team
curl -X POST -H 'Content-Type:application/json' -d '{"teamName": "Movestar Team"}' http://localhost:8080/team

### Player
curl -X POST -H 'Content-Type:application/json' -d '{"firstName": "Michel", "lastName": "Randa", "team": "http://localhost:8080/team/1"}' http://localhost:8080/player

## PUT

### Change Team
curl -X PUT -H 'Content-Type:text/uri-list' -d 'http://localhost:8080/team/2' http://localhost:8080/player/2/team
