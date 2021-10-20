package com.ikairui.captcha.web;

import com.ikairui.captcha.api.model.request.SendCaptchaRequest;
import com.ikairui.captcha.api.model.request.ValidateCaptchaRequest;
import com.ikairui.captcha.api.model.response.SendCaptchaResponse;
import com.ikairui.captcha.api.model.response.ValidateCaptchaResponse;
import com.ikairui.captcha.service.CaptchaService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/captcha")
public class CaptchaController {

    private final CaptchaService captchaService;

    public CaptchaController(CaptchaService captchaService) {
        this.captchaService = captchaService;
    }

    @PostMapping("/send")
    public SendCaptchaResponse send(@RequestBody @Validated SendCaptchaRequest request) {
        return captchaService.sendCaptcha(request);
    }

    @PostMapping("/validate")
    public ValidateCaptchaResponse validate(@RequestBody @Validated ValidateCaptchaRequest request) {
        return captchaService.validateCaptcha(request);
    }
}
