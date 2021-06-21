//package com.example.assignsem4ead.config;
//
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
//
//    @Override
//    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {
//
//    }
//
//    @Override
//    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {
//        System.out.println("AuthenticationProvider");
//        Object credentials = usernamePasswordAuthenticationToken.getCredentials();// lấy token từ phía client truyền vào
//        // kiểm tra xem credentials có bị null k, null thì báo lỗi
//
//        System.out.println("credentials:"+credentials.toString());
//        if(credentials != null){
//            String token = String.valueOf(credentials);
//            // k null thì kiểm tra với token đc cấp cho user trong DB: find user by token
//            // đúng thì build 1 cái user có username, password và role
//
//            return User.withUsername("admin").password("1203").roles("ADMIN").build();
//            // sau đó config sẽ đối chiếu quyền của user trong db để cho phép user đi vào các url hay k
//        }
//        throw new UsernameNotFoundException("Credential not found");
//    }
//}
