/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 9/2/13
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */

import java.math.BigInteger;
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
        BigInteger count = BigInteger.ZERO;

        while(!opened){

            pass = makepass(pass);

        }






    }


}
