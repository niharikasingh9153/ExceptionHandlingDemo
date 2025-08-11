package org.example.Collections;

import org.example.entity.Employee;

import java.util.HashSet;

public class HashcodeEqualsExample {
    static class Employees {
        String name;
        int id;
        Employees(String name, int id){
            this.name=name;
            this.id=id;
        }


    @Override

    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Employee)) return false;
        Employees e = (Employees) o;
        return id==e.id && name.equals(e.name);
    }

    @Override

    public int hashCode(){
        return  id*31 +name.hashCode();
    }
}
    public static void main(String[] args) {
        HashSet<Employees> employees=new HashSet<>();
        employees.add(new Employees("Sneha",101));
        employees.add(new Employees("Sneha",101));

        System.out.println(employees.size());

    }

}