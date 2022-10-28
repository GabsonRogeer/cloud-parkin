# Cloud Parking
## Projeto E Tecnologias
### Projeto
Projeto desenvolvido em conjunto com a DIO (Digital Innovation One) ao final do curso de Spring Framework
miniastrado por [Sandro Giacomozzi](https://github.com/sandrogiacom) no qual é possível controlar um estacionamento de veículos.
Onde serão controlados a entrada, saída e valor a ser cobrado do cliente.

### Tecnologias
- Java e Spring Boot
- Spring Security
- PostgreSQL
- Docker
- Swagger
- Rest-Assured
- Heroku

## Run database
```docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking_db -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=1234567 -d postgres:10-alpine```

## Start and Stop

### Stop Database
`docker stop parking-db`

### Start Database
`docker start parking-db`



## Client Url - Curl
`curl -X GET "https://portela-cloud-parking.herokuapp.com/parking" -H "accept: */*" -H "authorization: Basic dXNlcjoxMjM0NQ=="`
