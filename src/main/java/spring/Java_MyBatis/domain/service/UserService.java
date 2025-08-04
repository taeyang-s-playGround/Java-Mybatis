package spring.Java_MyBatis.domain.service;

import org.springframework.http.ResponseEntity;
import spring.Java_MyBatis.domain.dto.GetAllUserResponse;
import spring.Java_MyBatis.domain.dto.SignupRequest;
import spring.Java_MyBatis.domain.entity.User;

import java.util.List;

public interface UserService {

    List<GetAllUserResponse> getAllUserName();

    void signup(SignupRequest request);
}
