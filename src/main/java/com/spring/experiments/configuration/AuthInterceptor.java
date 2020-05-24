package com.spring.experiments.configuration;

import com.spring.experiments.service.AuthService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    AuthService authService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        String token = request.getHeader("token");
        try {
            authService.verifyToken(token);
            return true;
        } catch (Exception e) {
            response.sendError(HttpStatus.SC_UNAUTHORIZED, "Not authorized");
            return false;
        }
    }
}
