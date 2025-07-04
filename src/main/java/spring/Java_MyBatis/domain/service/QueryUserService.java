package spring.Java_MyBatis.domain.service;

import org.springframework.http.ResponseEntity;
import spring.Java_MyBatis.domain.entity.User;

import java.util.List;

public interface QueryUserService {

    public ResponseEntity<List<User>> execute();
}
