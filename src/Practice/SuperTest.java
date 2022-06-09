package Practice;

public class SuperTest {
    public static void main(String[] args) {
        //자식 클래스에서 super를 통해 부모 클래스의 생성자를 호출해주어서
        //다음과 같이 Wizard 인스턴스를 초기화하면서 생성할 수 있다.
        Wizard w = new Wizard("프로도", 100, 200);
    }
}

class Novice{
    protected String name;
    protected int hp;

    //부모 클래스 생성자
    public Novice(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
}

class Wizard extends Novice{
    protected int mp;

    public Wizard(String name, int hp, int mp){
        super(name, hp); //super를 통해 부모 클래스의 생성자 호출
        this.mp = mp;    //자식 클래스 생성자는 this로 정의
    }
}
