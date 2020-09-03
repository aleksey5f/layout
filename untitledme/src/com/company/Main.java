package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        System.out.print(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* Dog dog1 = new Dog();
        dog1.setAge(sc.nextInt());
        dog1.setName(sc.next());              // ПРАКТИКА
        System.out.println(dog1.toString());
        */
        System.out.print(" Введите кол-во элементов маасива: ");
        int n= sc.nextInt(),b=0;
        int sum=0;
        int[] a = new int[n];
        System.out.print(" массив и суммы ");
        for(int i=0;i<n;i++){
            a[i]= (int) (Math.random()*20);
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.print(" Sum(for) = "+sum);
        sum=0;
        while(b<n){
            sum+=a[b];
            b++;
        }
        System.out.print(" Sum(while) = "+sum);
        b=0;
        sum=0;
        do{
            sum+=a[b];
            b++;
        }while(b<n);
        System.out.println(" Sum(dowhile) = "+sum);
        System.out.print(" гармонический ряд ");
        for(double i=1;i<11;i++){
            System.out.print(1/i+" ");
        }
        System.out.println();
        System.out.print(" отсортированный массив ");
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print(" введите число для получения факторила: ");
        factorial(sc.nextInt());
        System.out.println(" <-ответ ");
        for (String str : args){
            System.out.println("arg = " + str);
        }
    }
}
