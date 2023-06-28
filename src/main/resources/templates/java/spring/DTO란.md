## DTO란?

-------------------------

DTO는 Data Transfrer Object의 약자로, 다른 레이어간의 데이터 교환에 활용됩니다.


간략하게 설명하자면 각 클래스 및 인터페이스를 호출하면서 전달하는 매개변수로 사용되는 데이터 객체입니다.

DTO는 데이터를 교환하는 용도로만 사용하는 객체이기 때문에 DTO에는 별도의 로직이 포함되지 않습니다.


### DTO와 VO
```
DTO와 VO의 역할을 서로 엄밀하게 구분하지 않고 사용할 때가 있습니다.
대부분의 상황에서 큰 문제가 발생하진 않지만 정확하게 구분하자면 역할과 사용법에서 차이가 있습니다.

VO는 데이터 그 자체로 의미가 있는 객체를 의미합니다. VO의 가장 특징적인 부분은 읽기전용으로 설계한다는 점입니다.

VO는 값을 변경할 수 없기 때문에 데이터의 신뢰성(무결성)을 유지해야합니다.

DTO는 데이터 전송을 위해 사용되는 데이터 컨테이너로 볼 수 있습니다. 같은 애플리케이션 내부에서 사용되는 것이 아니라
다른 서버로 전달할 경우에 사용됩니다.
```

-----------------------

### DTO클래스의 예

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
private String name;
private String email;
}


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
@GetMapping("/member")
public MemberDTO getMember() {
MemberDTO memberDTO = new MemberDTO();
memberDTO.setName("John");
memberDTO.setEmail("john@example.com");
return memberDTO;
}
}
@GetMapping 어노테이션을 사용하여 GET 요청을 처리하는 getMember() 메서드를 구현하였습니다.

getMember() 메서드에서는 MemberDTO 객체를 생성하고, 이름과 이메일 값을 설정한 후에 해당 객체를 반환합니다. 이렇게 하면 /member 엔드포인트로 GET 요청을 보낼 때 MemberDTO 객체가 JSON 형식으로 반환됩니다.

이 예제를 실행하고 /member 엔드포인트에 GET 요청을 보내면 다음과 같은 JSON 응답을 받을 수 있습니다:

{
"name": "John",
"email": "john@example.com"
}
