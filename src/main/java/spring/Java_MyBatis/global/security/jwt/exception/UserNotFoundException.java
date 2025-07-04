package spring.Java_MyBatis.global.security.jwt.exception;


import spring.Java_MyBatis.global.exception.CustomException;
import spring.Java_MyBatis.global.exception.ErrorCode;

public class UserNotFoundException extends CustomException {

    public static final CustomException EXCEPTION =
            new UserNotFoundException();

    private UserNotFoundException() {
        super(ErrorCode.EXPIRED_TOKEN);
    }
}