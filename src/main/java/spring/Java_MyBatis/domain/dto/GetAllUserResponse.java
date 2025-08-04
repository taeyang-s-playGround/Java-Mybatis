package spring.Java_MyBatis.domain.dto;

import lombok.Data;
import spring.Java_MyBatis.domain.entity.User;

@Data
public class GetAllUserResponse {

    private Long id;
    private String username;
    private String accountId;
    private String password;

    public GetAllUserResponse(User user) {
        id = user.getId();
        username = user.getUsername();
        accountId = user.getAccountId();
        password = user.getPassword();
    }
}
