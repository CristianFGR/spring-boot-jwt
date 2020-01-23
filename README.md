**JWT AUTHENTICATION**

_Para utilizar el JWT se debe realizar de la siguiente forma_

`curl --location --request POST 'localhost:8080/authenticate' \
 --header 'Content-Type: application/json' \
 --data-raw '{
 	"username": "javainuse",
 	"password": "password"
 }'`
 
 Esto retornara el token
 
` {
     "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1Nzk4MjQ3MTcsImlhdCI6MTU3OTgwNjcxN30.DMUfT6WgfvS3u37F4vVf5y_2NvxvjnC_DkPDMSetS3BHgtQbplBaFN3BkUV7ImV27vAevQcMfB7ViIYc79I-AQ"
 }`
 
 _Luego se consulta al endpoint que se necesite de la siguiente forma_
 
 `curl --location --request GET 'localhost:8080/obtener' \
 --header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZha`W51c2UiLCJleHAiOjE1Nzk4MjQ3MTcsImlhdCI6MTU3OTgwNjcxN30.DMUfT6WgfvS3u37F4vVf5y_2NvxvjnC_DkPDMSetS3BHgtQbplBaFN3BkUV7ImV27vAevQcMfB7ViIYc79I-AQ'
 
 _Para generar claves usar la siguiente URL_
 
` https://www.devglan.com/online-tools/bcrypt-hash-generator`