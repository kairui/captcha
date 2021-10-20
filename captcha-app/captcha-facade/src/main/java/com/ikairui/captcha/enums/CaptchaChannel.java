package com.ikairui.captcha.enums;

public enum CaptchaChannel {
    REGISTER(1, "注册"),
    LOGIN(2, "登陆"),
    MODIFY_PROFILE(3, "修改资料"),
    CHANGE_PASSWORD(4, "修改/找回密码");

    private final int channel;
    private final String channelName;

    CaptchaChannel(int channel, String channelName) {
        this.channel = channel;
        this.channelName = channelName;
    }

    public int getChannel() {
        return channel;
    }

    public String getChannelName() {
        return channelName;
    }

    public static CaptchaChannel resolve(int channel) {
        for (CaptchaChannel captchaChannel : values()) {
            if (captchaChannel.channel == channel) {
                return captchaChannel;
            }
        }
        return null;
    }
}
