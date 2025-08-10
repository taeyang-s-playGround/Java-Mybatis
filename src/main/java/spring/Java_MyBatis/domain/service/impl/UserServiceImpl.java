package spring.Java_MyBatis.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.Java_MyBatis.domain.dto.GetUserResponse;
import spring.Java_MyBatis.domain.dto.SignupRequest;
import spring.Java_MyBatis.domain.entity.User;
import spring.Java_MyBatis.domain.mapper.UserMapper;
import spring.Java_MyBatis.domain.service.UserService;
import spring.Java_MyBatis.global.security.jwt.exception.UserNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public List<GetUserResponse> getAllUser() {
        List<User> users = userMapper.getAllUsers();

        return users.stream()
                .map(GetUserResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public void signup(SignupRequest request) {
        userMapper.signup(request.getUsername(), request.getAccountId(),  request.getPassword());
    }

    @Override
    public GetUserResponse getUserById(Long userId) {
        User user = userMapper.getUserById(userId).orElseThrow(() -> UserNotFoundException.EXCEPTION);

        return new GetUserResponse(user);
    }
}
