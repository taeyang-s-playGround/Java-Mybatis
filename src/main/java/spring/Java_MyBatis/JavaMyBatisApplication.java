package spring.Java_MyBatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import spring.Java_MyBatis.domain.config.MyBatisConfig;

@SpringBootApplication
@Import(MyBatisConfig.class)
public class JavaMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMyBatisApplication.class, args);
	}
}
