## [Spring MVC](https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.spring-mvc)
Spring Boot에는 Spring MVC가 포함된 여러 개의 스타터(starter)가 있습니다.

일부 스타터는 Spring MVC를 직접 포함하는 대신에 Spring MVC에 대한 종속성(dependency)을 포함하고 있습니다.

이 섹션은 Spring MVC와 Spring Boot에 관한 일반적인 질문에 대한 답변을 제공합니다.

### JSON 형식으로 데이터를 주고받는 RESTful 서비스를 개발
Spring Boot 애플리케이션 내의 모든 Spring @RestController는\
Jackson2가 클래스패스에 있으면 기본적으로 JSON 응답을 생성해야 합니다.\
아래의 예시에서 보여지는 것과 같습니다.

    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController 
    public class MyController {
    
        @RequestMapping("/thing")
        public MyThing thing() {
            return new MyThing();
        }
    
    }

만약 MyThing이 Jackson2에 의해 직렬화될 수 있다면 (일반적인 POJO 또는 Groovy 객체의 경우 해당),\
기본적으로 localhost:8080/thing은 그것의 JSON 표현을 제공합니다.

그러나 주의할 점은 브라우저에서는 때때로 XML 응답을 볼 수도 있습니다.

이는 브라우저가 XML을 선호하는 accept 헤더를 보낼 수 있기 때문입니다.


----------------------
스프링 MVC패턴을 지키자.


1. Model은 Controller와 View에 의존하지 않아야 한다.
(Model 내부에 Controller와 View에 관련된 코드가 있으면 안된다.)

2. View는 Model에만 의존해야 하고, Controller에는 의존하면 안된다.
(VIew 내부에 Mdoel코드만 있을 수 있고, Controller의 코드가 있으면 안된다.)

3. View가 Model로부터 데이터를 받을 때는, 사용자마다 다르게 보여주어야 하는 데이터에 대해서만 받아야 한다.

4. Controller는 Model과 View에 의존해도 된다.
(Controller내부에는 Model과 View의 코드가 있을 수 있다.)

5. View가 Model로부터 데이터를 받을 때, 반드시 Controller에서 받아야한다.

[블로그 정리](https://keyboardwarrior.tistory.com/entry/Spring-MVC-%ED%8C%A8%ED%84%B4%EC%97%90-%EB%8C%80%ED%95%B4-%EC%95%8C%EC%95%84%EB%B3%B4%EC%9E%90)


