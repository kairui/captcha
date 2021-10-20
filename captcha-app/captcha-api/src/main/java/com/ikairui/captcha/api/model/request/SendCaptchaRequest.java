package com.ikairui.captcha.api.model.request;

import javax.validation.constraints.NotBlank;

public class SendCaptchaRequest {

    private String destination;
    private int action;

    @NotBlank
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }
}
