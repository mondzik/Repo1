package pl.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel Pawluczuk on 05/01/2017.
 */
//class Factors
//{
//    private int x,y;
//    public int getX() { return x;}
//    public int getY() { return y;}
//    public void setX(int x) { this.x=x;}
//    public void setY(int y) { this.y=y;}
//
//    public Factors() {}
//    public Factors(int x,int y) { this.x=x; this.y=y;}
//}


public class Math {
    public static List<Factors> getFactors(int number){
        int testNumber=1;
        List<Factors> factors=new ArrayList<Factors>();
        while(testNumber<=number)
        {

            if (testNumber%number==0){
                factors.add(new Factors(testNumber,number/testNumber));
            }

            testNumber++;
        }

        return factors;
    }
}
