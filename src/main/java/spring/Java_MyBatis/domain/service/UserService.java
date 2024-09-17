package spring.Java_MyBatis.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.Java_MyBatis.domain.controller.dto.SignupRequest;
import spring.Java_MyBatis.domain.mapper.UserMapper;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public void execute(SignupRequest request) {
        userMapper.save(request.getUsername(), request.getAccountId());
    }
}
