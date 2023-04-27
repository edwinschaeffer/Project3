package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class DisburseSecurityConfig {
	@Value("${ldap.urls}")
	private String ldapUrls;
	
	@Value("${ldap.base.dn}")
	private String ldapBaseDn;
	
	@Value("${ldap.username}")
	private String ldapSecurityPrincipal;
	
	@Value("${ldap.password}")
	private String ldapUrlsPrincipalPassword;
	
	@Value("${ldap.user.dn.pattern}")
	private String ldapUserDnPattern;
	
	@Value("${ldap.enabled}")
	private String ldapEnabled;
	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests() .requestMatchers("/login").permitAll()
	 * .requestMatchers("/signup").permitAll() .anyRequest() .fullyAuthenticated()
	 * .and() .formLogin() .and() .logout().logoutUrl("/logoutRedirection"); }
	 */

    
    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
    	if(Boolean.parseBoolean(ldapEnabled)) {
    		auth
    		.ldapAuthentication()
    		.contextSource()
    		.url(ldapUrls + ldapBaseDn)
    		.managerDn(ldapSecurityPrincipal)
    		.managerPassword(ldapUrlsPrincipalPassword)
    		.and()
    		.userDnPatterns(ldapUserDnPattern);
    	} else {
    		auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER")
    		.and()
    		.withUser("admin").password("{noop}admin").roles("ADMIN");
    	}
    }
}
