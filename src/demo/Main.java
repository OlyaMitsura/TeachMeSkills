package demo;

public class Main {
    public static void main(String[] args) {
        //       int num = 6;
        //       switch (num) {
        //           case 1:
        //               System.out.println("Spring");
        //               break;
        //           case 2:
        //               System.out.println("Summer");
        //               break;
        //           case 3:
        //               System.out.println("Autumn");
        //               break;
        //           case 4:
        //               System.out.println("Winter");
        //               break;
        //           default:
        //               System.out.println("Are you kidding me?");
        //       }
        int num1 = 15;
        int num2 = 18;
        if (num1 > num2) {
            System.out.println(num1);
        }
        if (num1 < num2) {
            System.out.println(num2);
        }
        if (num1 == num2) {
            System.out.println("Equal");
        }
        int i, j;
        boolean number;
        for (i = 2; i < 100; i++) {
            number = true;
            // проверить, делится ли число без остатка
            for (j = 2; j <= i / j; j++)
                // если число делится без остатка, значит, оно не простое
                if ((i % j) == 0) number = false;
            if (number)
                System.out.println(i + " - простое число.");
        }
    }
}
