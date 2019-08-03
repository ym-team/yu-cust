package com.hmn.ym;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServletComponentScan
@ImportResource("classpath:applicationContext.xml")
@MapperScan("com.hmn.ym.*")//扫描mapper re层，basePackages 为dao层所在路径，支持通配符*，多个以,分隔
public class Application {

	
	
	
	
	
	/**
	 * 
	 * 
	 * 坏人来了
	 * 
	 * */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
   
    
}
