package spring.Java_MyBatis.global.security.principle;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import spring.Java_MyBatis.domain.mapper.UserMapper;
import spring.Java_MyBatis.global.security.jwt.exception.UserNotFoundException;

@RequiredArgsConstructor
@Service
public class AuthDetailsService implements UserDetailsService {
    private final UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) {
        return new AuthDetails(userMapper.findByUserName(username)
            .orElseThrow(() -> UserNotFoundException.EXCEPTION));
    }
}
