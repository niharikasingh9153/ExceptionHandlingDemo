package org.example.Collections;

import org.example.entity.BankAccount;
import org.example.entity.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> n1 = new ArrayList<>();
        n1.add("Uddu");
        n1.add("Sam");
        n1.add("Akku");
        n1.add("Sumit");
        n1.add("Sumit");

        System.out.println(n1.toString());
        System.out.println(n1.get(2));


//        for(String name: n1){
//            System.out.print(name+" ");
//        }
        System.out.println("Before sorting");
        System.out.println(n1);

        System.out.println("After sorting");
        Collections.sort(n1);
        System.out.println(n1);

        Employee e = new Employee(1,"Nisha",2000);
        System.out.println(e.compareTo(n1));

        System.out.println("After sorting based on emp name");

//        Collections.sort(n1,);




        //Generic List
//        List name = new ArrayList();
//        name.add("Sneha");
//        name.add("KK");
//        name.add("RFS");
//        // name.add(255)---->Exception class type, (String hai)
//
//        for (Object names:name){
//            String n = (String)names;
//            System.out.println(n);
//        }




    }
}
