package com.atguigu.controller;
/**
 * -
 *
 * @author 周沫
 * @Date 2020-09-27
 * @Time 18:39
 */
import com.atguigu.properties.DataSourceProperties;
import com.atguigu.properties.DataSourceProperties2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableConfigurationProperties(DataSourceProperties2.class)
public class HelloController {

	@Autowired
	private DataSourceProperties2 dataSourceProperties2;

	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		System.out.println(dataSourceProperties2);
		return "hello spring boot!!";
	}

}