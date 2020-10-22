package kr.co.pboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("kr.co.pboard")
public class PboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(PboardApplication.class, args);
	}
	

	
}
