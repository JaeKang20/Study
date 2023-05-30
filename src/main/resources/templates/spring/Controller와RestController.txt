
@Controller와 @RestController는 Spring Framework에서 제공하는 주석(annotation)입니다. 웹 요청을 처리하는 클래스에 적용되는데,
이 두 주석의 차이로 인해 웹개발시 어떤 어려움이 생길수도 있습니다.

 그들이 처리하는 응답의 유형에 있습니다.

 Redirect에서 @RestControlle를 쓰면 본문의 내용에서 json형식으로 나오지만
 @Controller를 쓰면 잘 작동합니다.

@Controller: 기본적으로 Spring MVC의 Controller를 나타냅니다. 이 주석이 적용된 클래스는 주로 웹 페이지를 반환합니다.
메서드가 반환하는 문자열은 View 이름으로 해석되며, 해당 View를 찾아서 그에 따른 HTML을 생성한 후 클라이언트에게 응답합니다.
JSON 혹은 다른 몸체 응답을 반환하려면 메서드에 @ResponseBody 주석을 추가해야 합니다.

@RestController: @Controller와 @ResponseBody가 합쳐진 것입니다.
이 주석이 적용된 클래스는 주로 데이터(예: JSON, XML 등)를 반환합니다.
@RestController는 응답 몸체로 직접 데이터를 반환하게 됩니다.
따라서 @RestController를 사용하면 해당 컨트롤러의 모든 메서드가 @ResponseBody를 가진 것으로 간주됩니다.