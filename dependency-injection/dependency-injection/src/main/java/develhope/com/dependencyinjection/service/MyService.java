package develhope.com.dependencyinjection.service;

import develhope.com.dependencyinjection.Component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
        System.out.println("MyService constructor has been called");
    }

    public String getName() {

        System.out.println("getName Method has been called");

        return myComponent.getMyComponentName();
    }
}
