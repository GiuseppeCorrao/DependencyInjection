package develhope.com.dependencyinjection.controller;

import develhope.com.dependencyinjection.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
        System.out.println("MyController constructor has been called");
    }
    @GetMapping("")
    public String printWelcome(){
        return "Welcome";
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("the method getNameOnInternet has been called");
        return myService.getName();

    }
}
