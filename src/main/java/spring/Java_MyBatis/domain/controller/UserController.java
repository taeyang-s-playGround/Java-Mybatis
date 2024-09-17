package spring.Java_MyBatis.domain.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.Java_MyBatis.domain.controller.dto.SignupRequest;
import spring.Java_MyBatis.domain.service.UserService;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/signup")
    public void signup(@RequestBody SignupRequest request) {
        userService.execute(request);
    }
}
