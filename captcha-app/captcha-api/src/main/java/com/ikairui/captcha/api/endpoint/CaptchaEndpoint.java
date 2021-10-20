package com.ikairui.captcha.api.endpoint;

import com.ikairui.captcha.api.model.request.SendCaptchaRequest;
import com.ikairui.captcha.api.model.request.ValidateCaptchaRequest;
import com.ikairui.captcha.api.model.response.SendCaptchaResponse;
import com.ikairui.captcha.api.model.response.ValidateCaptchaResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "captcha-service", url = "/captcha")
public interface CaptchaEndpoint {

    @PostMapping("/send")
    SendCaptchaResponse sendCaptcha(@RequestBody @Validated SendCaptchaRequest request);

    @PostMapping("/validate")
    ValidateCaptchaResponse validateCaptcha(@RequestBody @Validated ValidateCaptchaRequest request);
}
