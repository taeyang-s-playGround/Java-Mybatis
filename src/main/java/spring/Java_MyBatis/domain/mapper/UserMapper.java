package spring.Java_MyBatis.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import spring.Java_MyBatis.domain.entity.User;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface UserMapper {

    void save(String username, String accountId);

    ResponseEntity<List<User>> getAllUsername();

    Optional<User> findByUserName(String username);
}