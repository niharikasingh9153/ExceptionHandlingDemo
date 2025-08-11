package org.example.SolidPrinciples;

public class SingletonObject {

    private static  SingletonObject object;

    public static SingletonObject getInstance(){
        if(object==null){
            object = new SingletonObject();

        }
        return object;
    }


}
