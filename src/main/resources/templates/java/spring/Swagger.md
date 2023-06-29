# Swagger - REST API 명세를 문서화 하는 방법
API를 개발하면 명세를 관리해야합니다. 명세란 해당  API가 어떤 로직을 수행하는지 설명하고
이 로직을 수행하기 위해 어떤 값을 요청하며, 이에 따른 응답값으로는 뭘 받을 수 있는지를 정리한 자료입니다.


API는 개발 과정에서 계속 변경되기 떄문에 주기적인 업데이트가 필요합니다. 
또한 명세작업은 번거롭고 시간 또한 오래 걸립니다. 이 같은 문제를 해결하기 위해 등장한것이 Swgger입니다.
Swagger를 사용하기 위해서 pom.xml에 의존성을 추가해줍니다.


       <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.9.2</version>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.9.2</version>
        </dependency>

springboot.api 폴더를 생성하고 Swagger 설정 코드를 만들어 보겠습니다.


    @Configuration
    @EnableSwagger2
    public class SwaggerConfiguration {
        @Bean
        public Docket api(){
            return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackages("com.springboot.api"))
                .paths(PathSelectors.any())
                .build();
        }

        private ApiInfo apiInfo(){
            return new ApiInfoBuilder()
                .title("Spring Boot Open API Test with Swagger")
                .description("설명 부분")
                .version("1.0.0")
                .build();
        }
    }


위 와 같은 내용을 구현하면 Swagger 사용을 위한 기본적인 설정이 완료됩니다.

~~~
.apis(RequestHandlerSelectors.basePackages("com.springboot.api"))
~~~
에서 스캔할 패키지 범위를 basePackages메서드로 설정합니다.
그러면 하위 패키지와 클래스를 모두 스캔해서 문서를 생성합니다.

앱을 실행시킨 상황에서 http://localhost:8080/swagger-ui.html 로 접속하면 Swagger 페이지가 출력됩니다.


    @GetMapping(vlaue = "/request1")
    public String RuqeustParam1 
    (@RequestParam String name,@RequestParam String email) {
    return name + " " + email;
    }
    }

여기서 쓰인 메서드를 수정해볼게요.

    @ApiOperation(value = "GET 메서드 예제", notes = "@RequestParam을 활용한 GET Method")
    @GetMapping(value = "/request1")
    public String getRequestParam1(
        @ApiParam(value = "이름", required = true) @RequestParam String name,
        @ApiParam(value = "이메일", required = true) @RequestParam String email{
    return name + " " + email ;
    }

대상 API는 ApiOperation, Api 매개 변수에 대한 설명은 ApiParam으로 합니다.
DTO 객체를 매개변수로 사용하면 DTO 클래스 내의 매개변수에도 정의할 수 있습니다.

이를 통해 REST API에 테스트를 진행 할 수 있습니다.