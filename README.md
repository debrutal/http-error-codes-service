# http-error-codes-service
Minimalistic services that generates a desired errorcode

## Start Application
```shell
mvn spring-boot:run
```


## Create Response Code
There is no validation of your input, since i did not want to include valid rfc status codes. This can fail if Spring
HttpStatus Enum does not have an appropriate Status, nor are there any parsing checks. 

Calling the service responds with a statuscode you provide.
> e.g: /400
> returns a response with a status code 400 

```shell
curl localhost:8080/200
```
