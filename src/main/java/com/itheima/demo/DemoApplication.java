package com.itheima.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //这个名称一定是固定的
@MapperScan(basePackages = "com.itheima.demo.mapper")  //指定被扫描的mapper所在的包路径
//这里面的写法基本上都是固定写法
public class DemoApplication {

	public static void main(String[] args) {
		//这个作用就相当于java类初始化spring的容器且内嵌的tomcat容器
		SpringApplication.run(DemoApplication.class, args);
	}
}
