package spring.Java_MyBatis.domain.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.Java_MyBatis.domain.controller.dto.SignupRequest;
import spring.Java_MyBatis.domain.entity.User;
import spring.Java_MyBatis.domain.service.QueryUserServiceImpl;
import spring.Java_MyBatis.domain.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final QueryUserServiceImpl queryUserService;

    @PostMapping("/signup")
    public void signup(@RequestBody SignupRequest request) {
        userService.execute(request);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUserName() {
        return queryUserService.execute();
    }
}
