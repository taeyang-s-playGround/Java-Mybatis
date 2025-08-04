package spring.Java_MyBatis.domain.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spring.Java_MyBatis.domain.dto.GetUserResponse;
import spring.Java_MyBatis.domain.dto.SignupRequest;
import spring.Java_MyBatis.domain.service.UserService;

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
    public List<GetUserResponse> getAllUserName() {
        return userService.getAllUserName();
    }

    @GetMapping("/{user-id}")
    public GetUserResponse findUser(@PathVariable("user-id") Long userId) {
        return userService.getUserById(userId);
    }
}
