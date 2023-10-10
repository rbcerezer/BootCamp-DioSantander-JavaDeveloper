package edu.rbcerezer.firstweek;

public class MyClass {
    
    public static void main(String[] args) {
        String firstName = "Rafael";
        String lastname = "Cerezer";

        String fullName = fullName (firstName, lastname);


       // System.out.print ("Hey there, welcome!!");
System.out.print(fullName);

    }

    public static String fullName (String firstName, String lastname) {
        return "Method Result = " + firstName.concat(" ").concat(lastname);
    }
}
