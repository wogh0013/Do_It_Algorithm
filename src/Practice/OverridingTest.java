package Practice;

public class OverridingTest {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "정사각형";
        s.length = 5;

        Triangle t = new Triangle();
        t.name = "삼각형";
        t.base = 4;
        t.height = 3;

        Circle c = new Circle();
        c.name = "원";
        c.radius = 4;

        //업 캐스팅 - 도형 배열에 정사각형, 삼각형, 원 담기
        Shape[] shapes = {s, t, c};

        //모든 도형 넓이 계산 및 출력
        for(int i=0; i<shapes.length; i++){
            Shape tmp = shapes[i];
            System.out.printf("%s의 넓이 : %.2f\n", tmp.name, tmp.area());
        }
    }
}

//부모 클래스
class Shape{
    String name;

    public double area(){
        return 0;
    }
}

class Square extends Shape{
    int length; //한 변

    public double area(){
        return length * length;
    }
}

class Triangle extends Shape{
    int base; //밑변
    int height; //높이

    public double area(){
        return 0.5 * base * height;
    }
}

class Circle extends Shape{
    int radius; //반지름

    public double area(){
        return Math.PI * radius * radius;
    }
}