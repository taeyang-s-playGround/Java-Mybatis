package spring.Java_MyBatis.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.Java_MyBatis.domain.controller.dto.SignupRequest;
import spring.Java_MyBatis.domain.mapper.UserMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryUserService {

    private final UserMapper userMapper;

    public List<String> execute() {
        return userMapper.allUserNames();
    }
}
