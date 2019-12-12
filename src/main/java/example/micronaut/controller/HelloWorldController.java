package example.micronaut.controller;

import example.micronaut.api.HelloWorld;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

/**
 * @author djz4712
 */
@Controller("/hello-world")
public class HelloWorldController {

    @Post
    public String hello(@Body HelloWorld helloWorldRequest){
        return "Hello "+helloWorldRequest.getName();
    }
}
