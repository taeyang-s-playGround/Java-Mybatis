package spring.Java_MyBatis.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import spring.Java_MyBatis.domain.entity.User;
import spring.Java_MyBatis.domain.mapper.UserMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryUserServiceImpl implements QueryUserService{

    private final UserMapper userMapper;

    @Override
    public ResponseEntity<List<User>> execute() {
        return userMapper.getAllUsername();
    }
}
