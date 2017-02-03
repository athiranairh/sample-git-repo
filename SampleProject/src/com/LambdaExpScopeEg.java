package com;

public class LambdaExpScopeEg {

   final static String salutation = "Hello! ";
   
   public static void main(String args[]){
      GreetingService greetService1 = message -> System.out.println(salutation + message);
      greetService1.sayMessage("Mahesh");
      System.out.println("end of file");
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }
}