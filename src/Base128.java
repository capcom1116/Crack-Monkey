/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 9/3/13
 * Time: 1:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class Base128 {

    public static void main(String[] args){

        Long testLong = new Long("2000000000");

        int[] test = tenTo128(testLong.longValue());

        for(int n=0; n<test.length; n++){
            System.out.println(test[n]);
            System.out.println((char) test[n]);
        }


    }

    public static int[] tenTo128(long n){

        int[] b128 = new int[(int) Math.ceil(Math.log(n)/Math.log(128))];

        for(int m=b128.length-1; m>=0; m--){
            b128[m] = (int) n % 128;
            n = n/128;
        }

        return b128;

    }


}
