package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    /*
        Implement the following methods:

        1. add, which accepts two floats and returns a float (both floats added together)

        2. add, which accepts two doubles and returns a double (both doubles added together)

        3. subtract, which accepts two floats and returns a float (first float minus second float)

        4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed

        5. multiply, which accepts two ints and returns an int (first int multiplied by second int)

        6. multiply, which accepts a string and an int, and returns a string containing the provided string
        as many times as the provided int separated by a comma. E.g.
        multiply("Hello", 3) -> "Hello,Hello,Hello"

        7. multiply, which accepts an array of Strings that each contain a number, and an int
        The method should return an array of ints that contain the value of multiplying each String number by the provided int
        E.g.
        multiply(["2", "7", "3"], 3) -> [6, 21, 9]
     */

        public float add (float num1, float num2) {
            return num1 + num2;
        }

        public double add (double num1, double num2) {
            return num1 + num2;
        }

        public float subtract (float num1, float num2) {
            return num1 - num2;
        }

        public String subtract (String val1, char val2) {

            return val1.replace(String.valueOf(val2),"");
        }

        public int multiply(int num1, int num2) {
            return num1 * num2;
        }

        public String multiply (String val, int num) {
            String string = val;
            for(int i = 0; i < num - 1; i++) {
                string += "," +val;
            }
            return string;
        }

        public int[] multiply(String[] stgArr, int num) {
            int[] arr = new int[stgArr.length];

            for(int i = 0; i < stgArr.length; i++) {
                arr[i] = Integer.parseInt(stgArr[i]) * num;
            }

            return arr;
        }








}
