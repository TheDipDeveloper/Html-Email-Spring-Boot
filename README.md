# Send Email with Thymeleaf Template in Spring Boot

CURL: <code>
curl --location 'http://localhost:8080/sendMailWithHtml' \
--header 'Content-Type: application/json' \
--data-raw '{
"to": "test@gmail.com",
"subject": "Message with HTML template",
"message": "Welcome to our YouTube Channel! Please SUBSCRIBE",
"name": "Viewers"
}'
</code>
