package top.dandan0214.booksite;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	/**
	 * 解决跨域问题
	 */

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedHeaders("*").allowedMethods("*").maxAge(3600)
				.allowCredentials(true);
	}
//
//	/**
	// * 拦截器添加
//	 */
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		// registry.addInterceptor(tokenInterceptor).addPathPatterns("/**").excludePathPatterns("/account/login");
//		super.addInterceptors(registry);
//	}
}
