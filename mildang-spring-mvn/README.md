

#
src/resources/application.properties
  - spring.datasource.url=jdbc:mysql://inter-mariadb.intermajor.co.kr:3306/inter_server_manager
  - spring.datasource.username=
  - spring.datasource.password=
  - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

  - spring.session.store-type=jdbc
  - spring.session.jdbc.initialize-schema=always
  - spring.profiles.active=dev



### Dockerfile 실행
```
docker build -t 002-docker .
docker run -d -p 3000:3100 --name 002 002-docker 
docker logs 002
```


