package spring.Java_MyBatis.domain.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import spring.Java_MyBatis.domain.mapper.UserMapper;
import spring.Java_MyBatis.domain.service.impl.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
class SignupUserTest {

    @Mock
    private UserMapper userMapper;

    @InjectMocks
    UserServiceImpl userService;

    @Test
    @DisplayName("회원가입 테스트")
    void signupTest() {
        //given


        //when

        //then


    }
}
