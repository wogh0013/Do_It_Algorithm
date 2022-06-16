package Practice;

public class CallByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("swap 전의 값 : a=%d b=%d\n", a, b);

        swap(a, b);
        System.out.printf("swap 후의 값 : a=%d b=%d\n", a, b);
    }

    public static void swap(int a, int b){
        int temp = b;
        b = a;
        a = temp;

        System.out.printf("swap 메서드 내의 값 : a=%d b=%d\n", a, b);
    }
}
