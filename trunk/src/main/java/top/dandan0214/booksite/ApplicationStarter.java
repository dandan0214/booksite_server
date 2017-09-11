package top.dandan0214.booksite;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @description springboot的启动类，用于启动项目
 *
 * @author YG
 *
 *         2017年7月5日
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("top.dandan0214.booksite.dao") // 配置mybatis mapper 扫描包
public class ApplicationStarter extends SpringBootServletInitializer {

	private static Logger logger = LoggerFactory.getLogger(ApplicationStarter.class);

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStarter.class, args);
	}

	/**
	 * 作用与在web.xml中配置负责初始化Spring应用上下文的监听器作用类似
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApplicationStarter.class);
	}
}
