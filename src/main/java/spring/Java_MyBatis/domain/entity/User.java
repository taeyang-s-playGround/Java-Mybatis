package spring.Java_MyBatis.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class User {
    private Long id;
    private String username;
    private String accountId;
    private String password;
}
