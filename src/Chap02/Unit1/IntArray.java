package Chap02.Unit1;

public class IntArray {
    public static void main(String[] args) {
        int[] a = new int[5]; //자료형이 int[5]형이고 길이가 5인 배열 a 선언

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2; //배열 구성 요소에 값 대입

        for(int i=0; i<a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
