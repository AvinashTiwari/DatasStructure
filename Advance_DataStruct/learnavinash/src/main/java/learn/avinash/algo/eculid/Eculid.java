package learn.avinash.algo.eculid;

public class Eculid {
    public int gcd(int number , int divisor){
        int remaning = (number % divisor);

        if(remaning != 0 ){
            return gcd(divisor,remaning);
        }else {
            return  divisor;
        }

    }

    public int gcd2(int number , int divisor){
        while(divisor !=0 ){
            int temp = divisor;
            divisor = (number % divisor);
            number = temp;
        }

        return number;
    }
}
