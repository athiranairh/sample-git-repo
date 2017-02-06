package com;

public class LambdaExpScopeEg {

   final static String salutation = "Hello world! ";
   
   public static void main(String args[]){
      GreetingService greetService1 = message -> System.out.println(salutation + message);
      greetService1.sayMessage("Mahesh");
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }
}