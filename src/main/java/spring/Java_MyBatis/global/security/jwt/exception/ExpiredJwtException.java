package spring.Java_MyBatis.global.security.jwt.exception;


import spring.Java_MyBatis.global.exception.CustomException;
import spring.Java_MyBatis.global.exception.ErrorCode;

public class ExpiredJwtException extends CustomException {

    public static final CustomException EXCEPTION =
            new ExpiredJwtException();

    private ExpiredJwtException() {
        super(ErrorCode.EXPIRED_TOKEN);
    }
}