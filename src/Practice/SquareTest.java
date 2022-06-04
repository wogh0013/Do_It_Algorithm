package Practice;

public class SquareTest {
    public static void main(String[] args) {
        Square s = new Square();
        s.length = 4;

        System.out.println("한 변의 길이가 " + s.length + "인 정사각형의 넓이: " + s.area());
    }
}

class Square{
    int length;

    int area(){
        return length * length;
    }
}
