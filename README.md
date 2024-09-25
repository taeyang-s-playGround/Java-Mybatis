# Java-Mybatis
Mybatis를 적용시키면서 놀기

제대로 하려했는데 Mybatis는 si 기업에서나 쓴다고 해서 그냥 대충만 만들어뒀습니다!

간단하게 Mybatis를 설명하자면 기존에 Jpa ORM은 findByUserId 이런식으로 Spring Data Jpa를 사용했다면 Mybatis는 쿼리를 직접 작성하여 선언한 메서드와 연결을 시켜주는 방식입니다
(SQL 문을 Java 객체로 자동으로 매핑 시켜주는  프레임워크)

![image](https://github.com/user-attachments/assets/21f199f6-7944-4166-93dd-e94c0cc2454c)

JPA는 Java객체와 DB엔티티(테이블) 자체를 그대로 매핑해서 처리 할 수 있는 접근 방식을 채택한 새로운 기술 표준입니다.
SQL문을 작성 할 필요가 없어지고, 좀 더 객체지향 관점에서 개발할 수 있게 하고, 개발을 용이하게 해줍니다.
