package org.RestAPi.ex_02_RA_Concepts;

public class APITesting_Lab04_BuilderPattern {
    // if you use builder pattern you have to give return type as class name
         // here you see class name
    public APITesting_Lab04_BuilderPattern step1(){
        System.out.println("Step 1");
        // when this method finished it will return instance of itself -> check return type
        return this;
    }
    public APITesting_Lab04_BuilderPattern step2(){
        System.out.println("Step 2");
        return this;
    }
    public APITesting_Lab04_BuilderPattern step3(String name){
        System.out.println("Step 3");
        System.out.println(name);
        return this;
    }

    public static void main(String[] args) {
        APITesting_Lab04_BuilderPattern bp = new APITesting_Lab04_BuilderPattern();
        System.out.println("with builder pattern we are able to call in a single line");
        bp.step1().step2().step3("Dinesh");
    }
}
