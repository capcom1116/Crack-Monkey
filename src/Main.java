/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 9/2/13
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

import net.lingala.zip4j.core.*;
import net.lingala.zip4j.exception.ZipException;

public class Main {

    private static char[] pass;
    private static BigInteger count;
    private static BigInteger TEN_THOUSAND;

    static {

        count = BigInteger.ONE;
        TEN_THOUSAND = new BigInteger("10000");
    }

    public static void main(String[] args) throws Exception{

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

        String destination = filename.substring(0, filename.length()-4);

        System.out.println(destination);

        File crackTarg = new File(filename);

        ZipFile crack = new ZipFile(crackTarg);



        boolean opened = false;




        while(!opened){

            incrementPass();

            try{
                crack.setPassword(Main.pass);

                crack.extractAll(destination);
            }catch(ZipException e){
            }

            if(Main.count.mod(Main.TEN_THOUSAND).intValue()==0){
                System.out.println(count.toString());
            }



        }






    }


    protected static void incrementPass(){

        Main.pass = Base128.tenTo128c(count);

        Main.count = count.add(BigInteger.ONE);


    }


}
