package Practice;

public class CallByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("swap 호출 전 : a=%d b=%d\n", a, b); //10, 20

        swap(a, b);
        System.out.printf("swap 호출 후 : a=%d b=%d\n", a, b); //10, 20
    }

    public static void swap(int x, int y){
        int temp = y;
        y = x;
        x = temp;

        System.out.printf("swap 메서드 내의 값 : x=%d y=%d\n", x, y); //20, 10
    }
}