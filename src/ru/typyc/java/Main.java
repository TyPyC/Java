package ru.typyc.java;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        while1();
    }

    static void while1() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        int i = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        System.out.println(sum);
        dowhile();
    }

    static void dowhile() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        int i = 0;
        do {
            sum = sum + array[i];
            i++;
        }
        while (i < array.length);
        System.out.println(sum);
        harm();

    }
    static void harm() {
        System.out.println(1);
        for (int i=2; i < 11; i++) {
            System.out.println(1 + "/" + i);
        }
        random();
    }

    static void random() {
        int[] arr;
        arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 12);
            System.out.println(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        mat_random();
    }

    static void mat_random(){
        Random arr = new Random();
        int Random[] = new int [12];
        for (int i = 0; i < Random.length; i++){
            Random[i] = arr.nextInt(12);
            System.out.println(Random[i] + " ");
        }
        Arrays.sort(Random);
        System.out.println(Arrays.toString(Random));
        fact(4);
    }

    public static int fact(int x){
        int res = 1;
        for (int i = 2; i < x+1; i++) {
            res = res * i;
        }
        System.out.println(res);
        return res;
    }
}