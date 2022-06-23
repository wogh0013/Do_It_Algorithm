package Chap03.Unit1;

import java.util.Scanner;

public class SeqSearch {
    //요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색한다.
    static int seqSearch(int[] a, int n, int key){
        for(int i=0; i<n; i++){
            if(a[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i=0; i<num; i++){
            System.out.print("x["+i+"]=");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : "); //키 값을 입력
        int key = sc.nextInt();

        int idx = seqSearch(x, num, key); //요솟수가 num인 배열 x에서 키 값이 key인 요소 검색

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(key + "은(는) x["+ idx + "]에 있습니다.");
    }
}
