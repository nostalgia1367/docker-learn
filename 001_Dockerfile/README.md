

1. “Hello Mildang” 을 출력하는 어플리케이션을 작성하고 (언어무관)
2. 컨테이너 이미지로 빌드한다. ( Dockerfile을 작성한다. )
3. Dockerfile 작성법은 검색하여 스스로 공부한다.
4. Docker 명령어로 빌드한 이미지를 구동한다.
5. 컨테이너의 로그를 확인한다.
6. 컨테이너 실행시 어플리케이션이 자동으로 실행되게 하여 컨테이너 실행과 7. 동시에 “Hello Mildang”이 출력되어야 한다.


```
npm install
node index.js
```


### Dockerfile 실행
```
docker build -t 001-docker .
docker run -d -p 3000:3100 --name 001 001-docker 
docker logs 001
```


### docker 삭제
```
docker stop 컨테이너ID & docker rm 컨테이너ID
또는 rm -f 컨테이너ID

docker rmi 001-docker

```



```
$ docker images 
REPOSITORY   TAG       IMAGE ID       CREATED       SIZE
<none>       <none>    e273fa25a9e3   2 hours ago   142MB

$ docker run -d -P e273fa25a9e3          
0f199f5febb159e8204bf57ca2034162ad88042c07a733735e79915aab2fec9c

$ docker ps -a                 
CONTAINER ID   IMAGE          COMMAND                  CREATED         STATUS         PORTS                   NAMES
0f199f5febb1   e273fa25a9e3   "/docker-entrypoint.…"   5 seconds ago   Up 3 seconds   0.0.0.0:3100->3000/tcp   001-docker
```