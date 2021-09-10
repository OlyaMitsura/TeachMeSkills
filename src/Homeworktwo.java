import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Homeworktwo {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 5;
        int num3 = -9;
        //    if (num1>0 && num2>0 && num3>0)
        //        System.out.println("3");
        //    else if (num1<=0 && num2>0 && num3>0)
        //        System.out.println("2");
        //    else if (num1<=0 && num2<=0 && num3>0)
        //        System.out.println("1");
        //    else if (num1<=0 && num2<=0 && num3<=0)
        //        System.out.println("0");
        //    else if (num1>0 && num2<=0 && num3<=0)
        //        System.out.println("1");
        //    else if (num1>0 && num2>0 && num3<=0)
        //        System.out.println("2");
        //    else if (num1>0 && num2<=0 && num3>0)
        //        System.out.println("2");
        //    else if (num1<=0 && num2>0 && num3<=0)
        //        System.out.println("1");
        //}
        if (num1 > 0 && num2 > 0 && num3 > 0)
            System.out.println("3+ & 0-");
        else if (num1 <= 0 && num2 > 0 && num3 > 0)
            System.out.println("2+ & 1-");
        else if (num1 <= 0 && num2 <= 0 && num3 > 0)
            System.out.println("1+ & 2-");
        else if (num1 <= 0 && num2 <= 0 && num3 <= 0)
            System.out.println("0+ & 3-");
        else if (num1 > 0 && num2 <= 0 && num3 <= 0)
            System.out.println("1+ & 2-");
        else if (num1 > 0 && num2 > 0 && num3 <= 0)
            System.out.println("2+ & 1-");
        else if (num1 > 0 && num2 <= 0 && num3 > 0)
            System.out.println("2+ & 1-");
        else if (num1 <= 0 && num2 > 0 && num3 <= 0)
            System.out.println("1+ & 2-");
    }
}
