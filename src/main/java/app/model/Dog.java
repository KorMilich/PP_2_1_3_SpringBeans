package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Dog extends Animal {

    public Dog() {
    }

    public String toString() {
        return "Im a Dog";
    }



}
