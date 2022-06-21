package Chap02.Unit1;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

    //배열 a의 최댓값을 구하여 반환하는 메서드 작성
    static int maxOf(int[] a){
        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] > max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = sc.nextInt(); //배열의 요소수

        int[] height = new int[num]; //요소수가 num인 height 배열 생성

        System.out.println("키 값은 아래와 같습니다.");
        for(int i=0; i<height.length; i++){ //요소값을 주는 for문
            height[i] = 100 + rand.nextInt(90); //요소의 값을 난수로 결정
            System.out.println("height[" + i + "] = " + height[i] + "cm");
        }

        System.out.println("최댓값은 " + maxOf(height) + "cm입니다.");
    }
}
