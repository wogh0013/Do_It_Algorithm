package Chap02.Unit1;

import java.util.Scanner;

public class ReversArray {

    //배열 요소 a[n1]과 a[n2]의 값을 바꿈
    static void swap(int[] a, int n1, int n2){
        int tmp = a[n1];
        a[n1] = a[n2];
        a[n2] = tmp;
    }

    //배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a){
        for(int i=0; i<a.length/2; i++)
            swap(a, i, a.length-i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for(int i=0; i<x.length; i++){
            System.out.print("x["+i+"]=");
            x[i] = sc.nextInt();
        }

        reverse(x); //배열 x의 요소를 역순으로 정렬

        System.out.println("요소를 역순으로 정렬했습니다.");
        for(int i=0; i<num; i++){
            System.out.println("x["+i+"]="+x[i]);
        }
    }
}
