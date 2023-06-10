package com.zeecoder.springbootdemo.conditional;

public class GmailNotificationProvider implements NotificationSender{
    @Override
    public String send(String message) {
        return "Gmail Notification provider: " + message;
    }
}
