package org.kamathad;

public class Main {
    public static void main(String[] args) {

        HelloServiceBasic helloServiceBasic = new HelloServiceBasic();
        helloServiceBasic.sayHello("Nangesh");


        HelloService helloService = new HelloService();
        helloService.sayHello("Gokesh");
    }
}