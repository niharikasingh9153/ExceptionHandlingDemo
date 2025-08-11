package org.example.Generics;

class Box<T>{
    private T value;
    public void set(T value){ this.value=value;}
    public T get(){ return value; }


}

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Hello");
        System.out.println("Value : "+box.get());

        Box<Integer> box1=new Box<>();

        box1.set(1);
        System.out.println("Value : "+box1.get());

    }
}
