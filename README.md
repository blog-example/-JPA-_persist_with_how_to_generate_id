# Entity의 Id 생성 전략에 따른 persist 메소드의 동작 확인

예제 블로그 링크: [블로그 링크](https://iwsaitw.tistory.com/entry/Entity%EC%9D%98-Id-%EC%83%9D%EC%84%B1-%EC%A0%84%EB%9E%B5%EC%97%90-%EB%94%B0%EB%A5%B8-EntityManager%EC%9D%98-persist-%EB%8F%99%EC%9E%91-%ED%99%95%EC%9D%B8)

<br />

## 사용방법
1. application.yml을 수정해야합니다.

```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/<본인의디비이름>
    username: <본인의 db의 유저이름>
    password: <아이디>
  jpa:
    show-sql: true
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        format_sql: true

```

2. 서비스 함수 실행시키는 방법
- 아래의 주소로 get 요청을 하면 서비스에 작성된 메소드가 실행이 됩니다.
```
 // GET 요청
 http://localhost:8080/mapping

```


