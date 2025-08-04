package spring.Java_MyBatis.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
public class SignupRequest {

    private String username;

    private String accountId;

    private String password;
}
