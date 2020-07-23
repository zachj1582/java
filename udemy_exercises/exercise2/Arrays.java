package exercise2;

import org.w3c.dom.ls.LSOutput;

public class Arrays {

    //Take the arrays.js file, and refactor the code into Java in this file.

    public static void main(String[] args){
        int[] nums = {10,23,3,4,5,2,1};
        String[] greetings = {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
        boolean[] binaries = {false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false};

        printNums(nums);
        printGreetings(greetings);
        printBinaries(binaries);
    }
    static void printNums(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println("\n");
    };


    static void printGreetings(String[] greetings) {
        for(int i = 0; i<greetings.length; i++){
            System.out.print(greetings[i] + ", ");
        }
        System.out.println("\n");
    };
    static void printBinaries(boolean[] binaries) {
        for(int i = 0; i<binaries.length; i++) {
            System.out.print(binaries[i] + ", ");
        }
    };
}







