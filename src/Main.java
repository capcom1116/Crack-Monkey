/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 9/2/13
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Scanner;
import java.io.*;

public class Main {


    public static void main(String[] args){

        System.out.println("Welcome to the Crack Monkey!\n" +
                "Please note that this software is intended" +
                "for educational use only.");


        String filename = "";

        if(args.length>0){
            filename = args[0];
        }else{
            System.out.println("Please input the pathname of the file you wish to crack.");

            Scanner scanny = new Scanner(System.in);

            filename = scanny.nextLine();

            scanny.close();
        }


        boolean opened = false;

        String pass = "";


//        while(!opened){
//
//            pass = makepass(pass);
//
//        }




    }

    /**
    public static String makepass(String input){

        char[] oldPass = input.toCharArray();



        return new String(incrementChar(oldPass));
    }

    public static char[] incrementChar(char[] input){

        outerloop:
        while(true){

            for(int n=0; n<input.length; n++){
                if(input[n] != 127){
                    break outerloop;
                }
            }

            char[] newArr = new char[input.length+1];

            for(int n =0; n<newArr.length;n++){
                newArr[n] = 0;
            }

            return newArr;
        }

        boolean carry = false;

        newswitch:
        for(int n=input.length-1; n>0; n--){
            if(input[n]!=127&&carry==false){
                input[n]++;
                break newswitch;
            }else if({
                input[n]=0;
                carry = true;
            }

            if(carry){
                if(input[n-1]==127){
                    input[n-1]=0;
                }else{
                    input[n-1]++;
                }
            }
        }

    }
    */
}
