package com.RookieWZW.spring.boot.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author RookieWZW
 * @version ����ʱ�䣺2018��8��4�� ����9:52:23 ��˵��
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static final String KEY = "RookieWZW.com";

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();

	}

	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setPasswordEncoder(passwordEncoder);
		authenticationProvider.setUserDetailsService(userDetailsService);

		return authenticationProvider;
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/css/**", "/js/**", "/fonts/**", "/index").permitAll() // �����Է���
				.antMatchers("/h2-console/**").permitAll() // �����Է���
				.antMatchers("/admins/**").hasRole("ADMIN") // ��Ҫ��Ӧ�Ľ�ɫ���ܷ���
				.and().formLogin() // ���� Form ����¼��֤
				.loginPage("/login").failureUrl("/login-error") // �Զ����¼����
				.and().rememberMe().key(KEY) // ���� remember me
				.and().exceptionHandling().accessDeniedPage("/403"); // �����쳣���ܾ����ʾ��ض��� 403 ҳ��
		http.csrf().ignoringAntMatchers("/h2-console/**"); // ���� H2 ����̨�� CSRF ����
		http.headers().frameOptions().sameOrigin(); // ��������ͬһ��Դ��H2 ����̨������
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
		auth.authenticationProvider(authenticationProvider());
	}

}
