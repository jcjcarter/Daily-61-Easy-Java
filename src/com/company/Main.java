package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        rotate(99);
    }


    public static void rotate(int num) {
        System.out.println(rotate(num, new StringBuilder()));
    }

    private static String rotate(int num, StringBuilder output) {
        String numStr = Integer.toBinaryString(num);
        if (numStr.contains("0")) {
            numStr = numStr.charAt(numStr.length() - 1) + numStr.substring(numStr.indexOf("1"), numStr.length() - 1);
            return rotate(Integer.parseInt(numStr, 2), output.append(num).append(" -> "));
        } else {
            return output.append(num).toString();
        }
    }
}
