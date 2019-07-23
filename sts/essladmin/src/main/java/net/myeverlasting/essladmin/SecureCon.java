package net.myeverlasting.essladmin;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import net.myeverlasting.essladmin.service.DetailService;
import net.myeverlasting.essladmin.utils.Encoder;

@Configuration
@EnableWebSecurity
public class SecureCon extends WebSecurityConfigurerAdapter {
	
	private DetailService detailService;	
    public SecureCon(DetailService detailService) {
		super();
		this.detailService = detailService;
	}

	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(detailService).passwordEncoder(Encoder.PASSWORD_ENCODER);
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic()
                .and()
                .cors()
                .and()
                .csrf().disable();
    }

    
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/home","/admin","/cfirm","/api/confirmation", "/api/isexist","/usps/queryusps","/webpay/iswstatus","/paysite/isw/*");
    }

}
