package Practice;

public class Polymorphism {
    public static void main(String[] args) {
        //객체 생성
        HolyKnight uther = new HolyKnight("우서", 180);

        //탱커로서의 역할 수행
        Tanker t = uther;
        t.increaseHp();

        //힐러로서의 역할 수행
        Healer h = uther;
        h.heal();
    }
}

interface Tanker{
    public void increaseHp();
}

interface Healer{
    public void heal();
}

class HolyKnight implements Tanker, Healer{
    private String name;
    private int hp;

    public HolyKnight(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public void increaseHp(){
        System.out.println("전체 체력을 +50 증가시킵니다.");
    }

    public void heal(){
        System.out.println("체력을 +30 회복합니다.");
    }
}