package com.ikairui.captcha.advice;

import com.ikairui.captcha.common.annotations.RawResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Method;

@RestControllerAdvice
public class ResponseBodyWriter implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(
            MethodParameter returnType,
            Class<? extends HttpMessageConverter<?>> converterType
    ) {
        if (returnType.hasMethodAnnotation(RawResponse.class)) {
            return false;
        }

        return !returnType.getContainingClass().isAnnotationPresent(RawResponse.class);
    }

    @Override
    public Object beforeBodyWrite(
            Object body,
            MethodParameter returnType,
            MediaType selectedContentType,
            Class<? extends HttpMessageConverter<?>> selectedConverterType,
            ServerHttpRequest request, ServerHttpResponse response
    ) {
        if (MediaType.APPLICATION_JSON.equals(selectedContentType)) {
            Method method = (Method) returnType.getExecutable();
            if (ResponseEntity.class.isAssignableFrom(method.getReturnType())) {
                return body;
            }

        }
        return body;
    }
}
