# spring-rabbitmq

create `docker-compose.yml` file:
```
rabbitmq:
  image: rabbitmq:management
  ports:
    - "5672:5672"
    - "15672:15672"
```

start docker compose:
```
network
sudo service docker start
docker-compose up
```