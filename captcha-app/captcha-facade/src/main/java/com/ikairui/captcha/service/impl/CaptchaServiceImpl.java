package com.ikairui.captcha.service.impl;

import com.ikairui.captcha.api.model.request.SendCaptchaRequest;
import com.ikairui.captcha.api.model.request.ValidateCaptchaRequest;
import com.ikairui.captcha.api.model.response.SendCaptchaResponse;
import com.ikairui.captcha.api.model.response.ValidateCaptchaResponse;
import com.ikairui.captcha.service.CaptchaService;
import org.springframework.stereotype.Service;

@Service
public class CaptchaServiceImpl implements CaptchaService {
    @Override
    public SendCaptchaResponse sendCaptcha(SendCaptchaRequest request) {
        return null;
    }

    @Override
    public ValidateCaptchaResponse validateCaptcha(ValidateCaptchaRequest request) {
        return null;
    }
}
