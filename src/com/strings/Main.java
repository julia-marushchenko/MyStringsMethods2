// Class String and its methods

package com.strings;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Method equals(Object anotherObject)
        boolean out = "String".equals("String"); // returns true
        boolean out1 = "String".equals("string"); // returns false

        // Printing out and out1 to console
        System.out.println(out);
        System.out.println(out1);

        // Method equalsIgnoreCase(String anotherString)
        boolean out2 = "String".equalsIgnoreCase("String"); // returns true
        boolean out3 = "String".equalsIgnoreCase("string"); // returns true

        // Printing out and out1 to console
        System.out.println(out2);
        System.out.println(out3);

        // Method int compareTo(String anotherString)
        // Creating strings to compare
        String str = new String("World");
        String str1 = new String("world");

        // Returns < 0
        System.out.println(str.compareTo(str1));

        // Returns > 0
        System.out.println(str1.compareTo(str));

        // Comparing the same strings with result 0
        System.out.println(str.compareTo(str));

    }
}