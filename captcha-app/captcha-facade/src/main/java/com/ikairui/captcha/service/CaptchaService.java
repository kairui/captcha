package com.ikairui.captcha.service;

import com.ikairui.captcha.api.model.request.SendCaptchaRequest;
import com.ikairui.captcha.api.model.request.ValidateCaptchaRequest;
import com.ikairui.captcha.api.model.response.SendCaptchaResponse;
import com.ikairui.captcha.api.model.response.ValidateCaptchaResponse;

public interface CaptchaService {
    SendCaptchaResponse sendCaptcha(SendCaptchaRequest request);

    ValidateCaptchaResponse validateCaptcha(ValidateCaptchaRequest request);
}
