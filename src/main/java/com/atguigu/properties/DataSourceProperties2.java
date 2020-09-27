package com.atguigu.properties;
/**
 * -
 *
 * @author 周沫
 * @Date 2020-09-27
 * @Time 18:52
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "spring.jdbc.datasource")
public class DataSourceProperties2 {

	@Value("${spring.jdbc.datasource.driverClassName}")
	private String driverClassName;
	@Value("${spring.jdbc.datasource.url}")
	private String url;
	@Value("${spring.jdbc.datasource.username}")
	private String username;
	@Value("${spring.jdbc.datasource.password}")
	private String password;

	@Override
	public String toString() {
		return "DataSourceProperties{" +
				"driverClassName='" + driverClassName + '\'' +
				", url='" + url + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
// 生成get set 和 toString方法
}