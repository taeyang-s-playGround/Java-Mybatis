package spring.Java_MyBatis.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import spring.Java_MyBatis.domain.entity.User;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface UserMapper {

    void signup(@Param("username") String username, @Param("account_id") String accountId, @Param("password")String password);

    List<User> getAllUsers(); // getAllUsername을 getAllUsers로 변경

    Optional<User> findByUserName(@Param("username") String username);
}
