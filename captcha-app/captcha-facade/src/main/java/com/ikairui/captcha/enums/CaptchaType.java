package com.ikairui.captcha.enums;

public enum CaptchaType {
    MOBILE(1) {
        @Override
        String displayName() {
            return "手机验证码";
        }
    },
    MAIL(2) {
        @Override
        String displayName() {
            return "邮件验证码";
        }
    };

    private final int type;

    CaptchaType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    abstract String displayName();
}
