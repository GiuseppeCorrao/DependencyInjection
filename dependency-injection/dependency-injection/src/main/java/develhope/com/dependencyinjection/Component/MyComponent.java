package develhope.com.dependencyinjection.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    String mycomponentname;

    public MyComponent(){

        this.mycomponentname = mycomponentname;




    }

    public String getMyComponentName() {

       String mycomponentnameImmutableName = mycomponentname;
        System.out.println("getMyComponentName method has been called");

        return mycomponentnameImmutableName;
    }
}
