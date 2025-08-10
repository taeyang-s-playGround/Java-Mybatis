package spring.Java_MyBatis.domain.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.Java_MyBatis.domain.dto.GetUserResponse;
import spring.Java_MyBatis.domain.dto.SignupRequest;
import spring.Java_MyBatis.domain.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // 회원가입 화면
    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // templates/signup.ftl 로 이동
    }

    @PostMapping("/signup")
    public void signup(@ModelAttribute SignupRequest request) {
        userService.signup(request);
    }

    @GetMapping
    public String getAllUserName(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "user-list"; // templates/user-list.ftl
    }

    @GetMapping
    public List<GetUserResponse> getAllUserName() {
        return userService.getAllUser();
    }

    @GetMapping("/{user-id}")
    public GetUserResponse findUser(@PathVariable("user-id") Long userId) {
        return userService.getUserById(userId);
    }
}
