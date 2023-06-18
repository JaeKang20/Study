#시작하세요! 도커/쿠버네티스
#도커를 배운 내용들을 정리하는 공간입니다.

# 도커의 중요성
1. 애플리케이션 개발·배포 편해집니다.
2. 운영환경 배포하려면 도커 이미지를 패키지로 만들어 운영서버에 전달하면 되므로 개발 운영 환경의 통합이 가능합니다.
3. 모놀리스 애플리케이션 (깃헙 /board 참고)같이 FE/BE/DB 환경 소규모 프로젝트는 강하게 연결되어 있는데
    MSA로 운영할 수 있는 장점이 있습니다.

    독립성이 좋다는 뜻은 언어에 종속되지 않고 변화에 빠르게 대응 가능하다는 뜻. 빠르고 동시에 환경을 제공.
    예를 들어 웹 서비스에서 DB컨테이너와 Server컨테이너로 분리할 수있고 서버를 동적으로 늘려서 부하를 분산할 수 있음.
    이건 도커 스웜모드나 쿠버네티스등의 컨테이너 오케스트레이션 플랫폼을 통해 사용하는것이 일반적.

# 도커는 이미지와 컨테이너
1. 도커는 이미지 안에 여러 컨테이너를 넣을 수 있다. 컨테이너 하나에 하나의 기능.
2. 도커 허브를 통해 이미지를 받아올 수도 있다. docker pull
3. 도커 컨테이너는 run또는 create 명령어.
    run pull > create > start > attach 순.
4. 목록 확인 ps -a(중지된것 포함)

5. 컨테이너 배포해보기.
    Spring 어플리케이션이름이 spring-petclinic이며, 프로젝트 상단에 Dockerfile 파일을 생성해준다.

    Dockerfile는 아래와 같은 상황이다.

    FROM openjdk:17-jdk

    COPY build/libs/spring-petclinic*.jar /app/spring-petclinic.jar

6. 터미널
    CMD ["java","-jar","/app/spring-petclinic.jar"]

    터미널 cd /spring-petclinic
    docker build -t spring-petclinic-image .

    docker run -p 8081:8080 spring-petclinic-image
   -p: [도커 내부 포트] : [도커 외부 포트]

 localhost:8081 또는 application.properties에서 localhost를 변경해주면 그대로 적용 가능.

    -d: 백그라운드에서 사용.
    -exec: deattach모드에서 사용할 수 있다.