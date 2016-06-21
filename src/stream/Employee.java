package stream;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee{
    private String name;
    private int age;
    private int bonus;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean isAdult(){
        return age>19;
    }

}

