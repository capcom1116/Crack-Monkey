package com.rubatosoft.BigMath;

/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 9/3/13
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * Extends the functionality of the BigInteger class by adding logarithms.
 */
public class ExtendBigInt{

    public static final double LOG_10 = Math.log(10);

    public static final BigDecimal ten = new BigDecimal("10");

    public static double log(BigInteger BigInt, int base){

        final double logOfTenInBase = LOG_10/Math.log(base);


        BigDecimal copy = new BigDecimal(BigInt);

        double result;

        //Divide down into components

        int C = 0;

        while(copy.compareTo(BigDecimal.TEN)>0){
            C++;    //hehehe
            copy = copy.divide(BigDecimal.TEN);
        }

        result = Math.log(copy.doubleValue())/Math.log(base) + ((double) C)*(logOfTenInBase);


        return result;
    }


}
