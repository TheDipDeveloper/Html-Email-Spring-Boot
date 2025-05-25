package com.dipdeveloper.spring_html_email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;

@RestController
public class EmailController {

    @Autowired
    private EmailServiceImpl emailServiceImpl;

    @PostMapping("/sendMailWithHtml")
    public String sendMailWithHtml(@RequestBody EmailDetails emailDetails) {
        Context context = new Context();
        context.setVariable("name", emailDetails.getName());
        context.setVariable("message", emailDetails.getMessage());
        context.setVariable("subject", emailDetails.getSubject());
        try {
            emailServiceImpl.sendEmailWithHtml(emailDetails.getTo(),
                    emailDetails.getSubject(),
                    "EmailTemplate",
                    context);
            return "Email sent successfully with HTML template.";
        } catch (Exception e) {
            return "Error sending email: " + e.getMessage();
        }
    }
}