package org.example;

import org.example.entity.BankAccount;
import org.example.entity.Employee;
import org.example.service.BankAccountImplementation;
import org.example.service.BankAccountService;

import java.util.*;

public class Main {

        public static int  findDivisionIntegers(int a, int b){
            int div=0;
            int[] nums = {1,2,3,4,5,6};
            try {
                div= a/b;
                System.out.println(nums[7]);
            }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Something went wrong!!!!");
//                e.printStackTrace();
                System.out.println(e.getMessage());
            }
            return div;

        }

    public static int  findDivisionIntegersException(int a, int b){
        int div=0;
//        try {
            if(b==0){
                throw new ArithmeticException("Yehhhh Ni karna hai!!!!");
            }else {
                div = a / b;
            }
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
        return div;

    }
        public static void main(String[] args) {
//            System.out.println("Hello Welcome to our App.....");
//            int div = findDivisionIntegers(12,0);
//            System.out.println("Division is : "+div);
//
//            int division = findDivisionIntegersException(13,0);
//            System.out.println(division);


            BankAccount account = new BankAccount(101,"Niharika Singh", 567345567, 200,1000);
            BankAccountService service = new BankAccountImplementation();
            System.out.println("Balance in your Account "+service.checkBalance(account));
//            System.out.println("Balance after withdrawal "+service.withdrawAmount(account,1000));

            System.out.println("Balance after Deposit "+service.depositAmmount(account,200));




            ArrayList<String> students = new ArrayList<>();
            students.add("Amit");
            students.add("Smit");
            students.add("Krishna");
            students.add("Ranjit");

            System.out.println(students);

//Linked list
            LinkedList<String> tasks = new LinkedList<>();
            tasks.add("Write report");
            tasks.add("Email client");
            tasks.add("Attend meeting");

            System.out.println(tasks);

            //HashSet

            HashSet<String> countries = new HashSet<>();
            countries.add("India");
            countries.add("Nepal");
            countries.add("Bangladesh");

            System.out.println(countries);


            //LinkedHashSet


            LinkedHashSet<String> country=new LinkedHashSet<>();
            country.add("India");
            country.add("Nepal");
            country.add("Bangladesh");

            System.out.println(country);


            //PriorityQueue

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            pq.add(30);
            pq.add(20);
            pq.add(10);

            while (!pq.isEmpty()){
                System.out.println(pq.poll());
            }


            //Array Dequeue

            ArrayDeque<String> dq=new ArrayDeque<>();
            dq.add("First");
            dq.add("Second");
            dq.add("Third");

            System.out.println(dq);


            //HashM<ap

            HashMap<Integer,String> map = new HashMap<>();
            map.put(101,"Amrit");
            map.put(102,"Neha");
            map.put(103,"Ravi");

            System.out.println(map.get(102));




        }

    }
