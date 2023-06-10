package com.zeecoder.springbootdemo.configuration;

import com.zeecoder.springbootdemo.conditional.GmailNotificationProvider;
import com.zeecoder.springbootdemo.conditional.NotificationSender;
import com.zeecoder.springbootdemo.conditional.YahooNotificationProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfiguration {

    @Bean(name = "gmailNotification")
    @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "gmail",
            matchIfMissing = true)  // matchIfMissing = true if property not exist
    public NotificationSender gmailNotificationSender() {
        return new GmailNotificationProvider();
    }

    @Bean(name = "yahooNotification")
    @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "yahoo")
    public NotificationSender yahooNotificationSender() {
        return new YahooNotificationProvider();
    }

}
