package com.diceprojects.calculationsservice.secutiry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class ApiKeyInterceptor implements ApiKeyInterceptorExtract {

    private static final String API_KEY_HEADER = "X-Api-Key";
    private static final String EXPECTED_API_KEY = "1234";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String apiKey = request.getHeader(API_KEY_HEADER);

        if (apiKey == null || !apiKey.equals(EXPECTED_API_KEY)) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }

        return true;
    }
}
