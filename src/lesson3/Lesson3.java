package lesson3;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

        System.out.println("0) Здесь будет задача с заменой местами максимального значения с нулевым элементом, я к ней вернусь");
        double[] myArray = {8.4, 5.8, 11.1, 10.9};
        double max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Максимальное значение в массиве:" + max);

        System.out.println("1) Чётные в столбик и в строчку");
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }
        int[] Massiv = new int[a];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Massiv[b] = i;
                System.out.print(Massiv[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < Massiv.length; i++) {
            System.out.println(Massiv[i]);
        }
        System.out.println("2) Список нечётных в разном направлении");
        int c=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0)c++;
        }
        int[] Odd = new int[c];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                Odd[b]=i;
                System.out.print(Odd[b]+" ");
                b++;
            }
        }
        System.out.println(" ");
        for(int i=Odd.length-1;i>=0;i--){
            System.out.println(Odd[i] + " ");
        }

        System.out.println("5) Среднее арифметическое двух массивов");
        double sumMas1=0,sumMas2=0;
        int[] Mas1 = new int[15];
        for(int i=0;i<Mas1.length;i++){
            Mas1[i]=(int)(Math.random()*6);
            System.out.print(Mas1[i] +" ");
            sumMas1+=(double)Mas1[i]/Mas1.length;
        }
        System.out.println(" ");
        int[] Mas2=new int[15];
        for(int i=0;i<Mas2.length;i++){
            Mas2[i] =(int)(Math.random()*6);
            System.out.print(Mas2[i] +" ");
            sumMas2+=(double)Mas2[i]/Mas2.length;
        }
        System.out.println(" ");
        if(sumMas1==sumMas2)System.out.println("Средние арифметические значения двух массивов равны");
        else {if(sumMas1>sumMas2)
            System.out.println("Среднее арифметическое значение 1 массива больше и равно "+ sumMas1);
        else System.out.println("Среднее арифметическое значение 2 массива больше и равно "+sumMas2);
        }

    }
}
