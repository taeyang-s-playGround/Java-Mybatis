package spring.Java_MyBatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import spring.Java_MyBatis.domain.config.MyBatisConfig;

@SpringBootApplication
@MapperScan("spring.Java_MyBatis.domain.mapper")
@Import(MyBatisConfig.clas)
public class JavaMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMyBatisApplication.class, args);
	}
}
