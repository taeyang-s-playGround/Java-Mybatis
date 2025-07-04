package spring.Java_MyBatis.global.security.jwt.exception;


import spring.Java_MyBatis.global.exception.CustomException;
import spring.Java_MyBatis.global.exception.ErrorCode;

public class InvalidJwtException extends CustomException {

    public static final CustomException EXCEPTION = new InvalidJwtException();

    private InvalidJwtException() {
        super(ErrorCode.INVALID_TOKEN);
    }
}
