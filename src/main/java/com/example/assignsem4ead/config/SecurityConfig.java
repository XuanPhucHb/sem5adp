//package com.example.assignsem4ead.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
////@Configuration
////@EnableWebSecurity
////@Order(1)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
////    public static final String PROTECTED_URLS = "/nxp/v1/user/**";
////
////    @Autowired
////    AuthenticationProvider provider;
////
////    //Cách check token, thông tin login
////    @Override
////    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
////        System.out.println("zo configure(final AuthenticationManagerBuilder");
////        auth.authenticationProvider(provider);
////    }
////
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        System.out.println("SecurityConfig configure");
////        http
////                .addFilterBefore(authenticationFilter(), AnonymousAuthenticationFilter.class)
////                .authorizeRequests()
////                .and()
////                .formLogin()
////                .usernameParameter("username")
////                .passwordParameter("password")
////                .loginPage("/nxp/v1/account/login").loginProcessingUrl("/nxp/v1/account/loginAc").permitAll()
////                .and().csrf().disable();
////    }
////    @Bean
////    public AuthenticationFilter authenticationFilter() throws Exception{
////        System.out.println("zo authenticationFilter");
////        final AuthenticationFilter filter = new AuthenticationFilter(new AntPathRequestMatcher(PROTECTED_URLS));
////        filter.setAuthenticationManager(authenticationManager());
////        return filter;
////    }
//}
