package org.example.Map;

import org.example.entity.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
//    private Employee employee;
    public static void main(String[] args) {
        Map<String,Integer> scores = new HashMap<>();

        scores.put("Alice",101);
        scores.put("Sneha",102);
        scores.put("Kanara",103);
        scores.put("Adviya",104);

        System.out.println(scores);

        //Entry interface

//        for (String key: scores.keySet()){
//            System.out.println(key+" : "+scores.keySet());
//        }

        Set<String> keySet = scores.keySet();

        System.out.println(keySet);

        for(String key: keySet){
            Integer value = scores.get(key);
            System.out.println(key+" : "+value);
        }

        System.out.println();

        Map<String,Employee> empMap = new HashMap<>();
        empMap.put("emp_01", new Employee(1,"Nisha",120000));
        empMap.put("emp_02", new Employee(2,"Rahul",120000));
        empMap.put("emp_03", new Employee(3,"Kashish",465884));

        System.out.println(empMap);

        System.out.println();
        Set<Map.Entry<String,Employee>> empEntrySet= empMap.entrySet();

        for (Map.Entry<String,Employee> entry:empEntrySet){
            System.out.println("Emp Id : "+entry.getKey());
            System.out.println("Emp Name : "+entry.getValue());
        }

        System.out.println();
        empMap.forEach((empId,employee)
            ->System.out.println("ID -"+empId+" | EmpName - "+employee.getName()));







    }
}
