package com.dipdeveloper.spring_html_email;

import org.thymeleaf.context.Context;

public interface EmailService {
    void sendEmailWithHtml(String to, String subject, String template, Context context);
}
