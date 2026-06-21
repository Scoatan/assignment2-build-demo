package com.johnathan.homework;

// APPICATION CODE!

public class App {

    public static String getBuildMessage() {
	return "Assignment 5: Docker container rebuild test is working - updated by Johnathan G Baez.";
    }

    // Adding Method [METHOD TO BE TESTED]
    
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
    	
        System.out.println(getBuildMessage());
        System.out.println("This project includes unit testing natively. \n");

        int a = 2;
        int b = 3;
        int result = addNumbers(a, b);

        System.out.println("Result = (" + a + " + " + b + ") = " + result);
    }
}
