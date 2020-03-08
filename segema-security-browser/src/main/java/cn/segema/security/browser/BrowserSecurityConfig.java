package cn.segema.security.browser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author wangyong
 *
 */
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.formLogin()
		.loginPage("/segema-signIn.html")
		.and().authorizeRequests().anyRequest().authenticated();

		// .loginPage("/segema-signIn.html").and().authorizeRequests();

	}

}
