package develhope.com.dependencyinjection.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    String mycomponentname;

    public String myComponent(){

        System.out.println("MyComponent constructor has been called ");

        String mycomponentImmutableName = "giuseppe";

        mycomponentname = mycomponentImmutableName;

        return mycomponentImmutableName;




    }

    public String getMyComponentName() {

       String mycomponentnameImmutableName = myComponent();
        System.out.println("getMyComponentNam method has been called");

        return mycomponentnameImmutableName;
    }
}
