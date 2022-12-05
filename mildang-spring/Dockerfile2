# 실행 파일 빌드 부분
# 이미지는 openjdk 버전 8-jdk-alpine에서 실행된다.
FROM openjdk:8-jdk-alpine as TEMP_BUILD_IMAGE

# 변수 사용
ENV APP_HOME=/usr/app/

# 작업 폴더 위치 설정
WORKDIR $APP_HOME

# 실행시 필수 파일 복사
COPY gradlew $APP_HOME
COPY build.gradle $APP_HOME
COPY settings.gradle $APP_HOME
COPY gradle $APP_HOME/gradle

RUN ./gradlew -x test build || return 0

# 프로젝트 소스 폴더 복사
COPY src src

# gradlew 빌드
RUN ./gradlew bootjar

# Docker 이미지 실행
FROM openjdk:8-jdk-alpine
ENV TZ Asia/Seoul
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME

# 위에서 빌드한 파일을 test.jar 파일로 복사
COPY --from=TEMP_BUILD_IMAGE $APP_HOME/build/libs/test.jar .

# 컨테이너는 8080 포트로 실행된다
EXPOSE 8080

# 컨테이너를 구동할 때 실행할 명령어 지정(명렁어를 스페이스로 나눈것과 같다)
ENTRYPOINT ["java","-jar","/test.jar"]