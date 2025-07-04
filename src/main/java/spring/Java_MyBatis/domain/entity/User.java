package spring.Java_MyBatis.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class User {

    private Long id;
    private String username;
    private String accountId;
}
