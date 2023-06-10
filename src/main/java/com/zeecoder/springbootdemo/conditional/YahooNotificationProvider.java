package com.zeecoder.springbootdemo.conditional;

import com.zeecoder.springbootdemo.conditional.NotificationSender;

public class YahooNotificationProvider implements NotificationSender {
    @Override
    public String send(String message) {
        return "Yahoo Notification provider: " + message;
    }
}
