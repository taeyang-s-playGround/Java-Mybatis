package spring.Java_MyBatis.domain.service.impl;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import spring.Java_MyBatis.domain.dto.GetAllUserResponse;
import spring.Java_MyBatis.domain.dto.SignupRequest;
import spring.Java_MyBatis.domain.entity.User;
import spring.Java_MyBatis.domain.mapper.UserMapper;
import spring.Java_MyBatis.domain.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public List<GetAllUserResponse> getAllUserName() {
        List<User> users = userMapper.getAllUsers();

        return users.stream()
                .map(GetAllUserResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public void signup(SignupRequest request) {
        userMapper.save(request.getUsername(), request.getAccountId(),  request.getPassword());
    }
}
