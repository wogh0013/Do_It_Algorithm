package Practice;

public class SquareTest {
    public static void main(String[] args) {
        Square1 s = new Square1();
        s.length = 4;

        System.out.println("한 변의 길이가 " + s.length + "인 정사각형의 넓이: " + s.area());
    }
}

class Square1{
    int length;

    int area(){
        return length * length;
    }
}
