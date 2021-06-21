//package com.example.assignsem4ead.config;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//public class AccountDetailService implements UserDetailsService {
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if (username.equals("admin")) {
//            return User.withUsername("admin").password("1203").roles("ADMIN").build();
//        } else {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//    }
//}
