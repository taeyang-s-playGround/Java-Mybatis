package spring.Java_MyBatis.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import spring.Java_MyBatis.domain.entity.User;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    void save(String username, String accountId);
    List<String> allUserNames();
    Optional<User> findByUserName(String username);
}