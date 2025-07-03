// Immutable class String and its methods

package com.strings;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating String object
        String str = new String("I am String");

        // Printing to console original string
        System.out.println("Original string: " + str);

        // Using toLowerCase() to convert all characters to lower case
       str = str.toLowerCase();

        // Printing to console transformed string
        System.out.println("Transformed one time string: " + str);

        // Using toUpperCase() to convert all characters to upper case
        str = str.toUpperCase();

        // Printing to console transformed string
        System.out.println("Transformed second time string: " + str);
    }
}