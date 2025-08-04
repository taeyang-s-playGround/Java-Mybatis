package spring.Java_MyBatis.domain.service;

import spring.Java_MyBatis.domain.dto.GetUserResponse;
import spring.Java_MyBatis.domain.dto.SignupRequest;

import java.util.List;

public interface UserService {

    List<GetUserResponse> getAllUserName();

    void signup(SignupRequest request);

    GetUserResponse getUserById(Long userId);
}
