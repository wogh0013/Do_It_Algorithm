package Practice;

public class CatTest {
    public static void main(String[] args) {
        //새로운 Cat 객체 생성
        Cat c = new Cat();

        //필드값 변경
        c.name = "네로";
        c.breeds = "페르시안";
        c.age = 3;

        System.out.println("이름: " + c.name);
        System.out.println("품종: " + c.breeds);
        System.out.println("나이: " + c.age);

        c.claw();
        c.meow();
    }
}

class Cat{
    String name;
    String breeds;
    int age;

    void claw(){
        System.out.println("할퀴기!");
    }

    void meow(){
        System.out.println("냐옹~");
    }
}
