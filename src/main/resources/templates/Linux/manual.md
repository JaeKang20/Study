
시작하기 앞서..\
**맥북에서 chsh -s /bin/bash 명령어**사용하여 bash쉘을 이용한다.

본 내용은 man 명령어를 통해서 매뉴얼을 정리해보는 카테고리이다.

### 매뉴얼 소개
시스템에 관한 명령어들을 찾아볼땐 man 명령어 사용한다.

    man 궁금한 명령어

그러면 그에 대한 문서를 확인해볼 수 있다. (*빠져나갈땐 q버튼)

### 매뉴얼 탐색 및 검색

매우 긴 페이지는 스페이스바를 통해 페이지 씩 옮겨갈 수 있다.\
또 재밌는건 h버튼을 누르면 less화면으로 축약해서 보여준다는 점이다.

    ncal -w
위 명령어는 무슨 의미가 있을까?

    man ncal
    /-w
위 명령어로 확인해보면 매뉴얼에서 -w옵션에 대해 하이라이트시켜서 바로 보여준다.


### 매뉴얼 시놉시스

![매뉴얼옵션.png](img.png)
명령어 대괄호 안에는 옵션이다. 들어가도 되고 안들어가도 된다.\
number같은 경우 1,2,3 번호를 적어주면 된다.

    man echo [OPTION]... [STRING]...
    man cp [OPTION]... SOURCE DEST
위 명령어를 통해서도 어떤 내용이 필요한지 발견할 수 있다.\
옵션, 문자열, 저장 경로 등..

### 매뉴얼 7가지 섹션

매뉴얼에는 괄호 양 옆 넘버가 있는데 그 넘버에도 종류가 있음
1.   General Commands Manual
2.   System Calls Manual
3.   Library Functions Manual
4.   Kernel Interfaces Manual
5.   File Formats Manual
6.   Games Manual
7.   Miscellaneous Information Manual
8.   System Manager's Manual
9.   Kernel Developer's Manual

가장 많이 쓰이는건 1번이다.

 * TIP) man에 나오지 않는 명령어 경우 ex) cd,pwd는 help명령어 사
