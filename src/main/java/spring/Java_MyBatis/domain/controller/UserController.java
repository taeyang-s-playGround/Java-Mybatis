package spring.Java_MyBatis.domain.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.Java_MyBatis.domain.dto.GetAllUserResponse;
import spring.Java_MyBatis.domain.dto.SignupRequest;
import spring.Java_MyBatis.domain.entity.User;
import spring.Java_MyBatis.domain.service.UserService;
import spring.Java_MyBatis.domain.service.impl.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public void signup(@RequestBody @Valid SignupRequest request) {
        userService.signup(request);
    }

    @GetMapping
    public List<GetAllUserResponse> getAllUserName() {
        return userService.getAllUserName();
    }
}
