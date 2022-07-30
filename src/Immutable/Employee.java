package Immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class Employee {
    
    private final int id ;
    private final String name ;
    private final List<String> mobile;


    public Employee(int id, String name, List<String> mobile) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getMobile() {
       // return mobile;
        //return Collections.unmodifiableList(mobile);
        return new ArrayList<>(mobile);
    }

    public static void main (String args []){

        Employee emp = new Employee(1,"Ravi", Arrays.stream(new String []{"12345","55545"}).collect(Collectors.toList()));
         //emp.id=1;
        // emp.name="tagv";

        System.out.println(emp);
        emp.getMobile().add("4545");
       // emp.mobile.add("121");

        System.out.println(emp);

    }
}
