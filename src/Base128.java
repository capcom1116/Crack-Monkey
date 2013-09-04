import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 9/3/13
 * Time: 1:26 AM
 * To change this template use File | Settings | File Templates.
 */

import com.rubatosoft.BigMath.ExtendBigInt;

public class Base128 {

    public static final BigInteger The_128 = new BigInteger("128");

    public static void main(String[] args){

        Long testLong = new Long("2000000000000000");

        int[] test = tenTo128(new BigInteger(testLong.toString()));

        char[] testChar = tenTo128c(new BigInteger(testLong.toString()));

        for(int n=0; n<test.length; n++){
            System.out.println(test[n]);
            System.out.println((char) test[n]);
        }

        System.out.println(new String(testChar));

    }

    public static int[] tenTo128(BigInteger input){




        int[] b128 = new int[(int) Math.ceil(ExtendBigInt.log(input, 128))];

        for(int m=b128.length-1; m>=0; m--){
            b128[m] = input.mod(The_128).intValue();
            input = input.divide(The_128);
        }

        return b128;

    }

    public static char[] tenTo128c(BigInteger input){




        char[] b128 = new char[(int) Math.ceil(ExtendBigInt.log(input, 128))];

        for(int m=b128.length-1; m>=0; m--){
            b128[m] = (char) input.mod(The_128).intValue();
            input = input.divide(The_128);
        }

        return b128;

    }


}
