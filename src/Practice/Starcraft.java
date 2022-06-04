package Practice;

public class Starcraft {
    public static void main(String[] args) {
        //객체 생성
        Marine m = new Marine("레이너", 80);
        Medic m2 = new Medic("모랄레스", 60, 60);

        //마린의 스팀팩
        m.stimpack();

        //메딕의 힐
        m2.heal(m, m2);
    }
}

class Marine{
    String name;
    int hp;

    Marine(String n, int h){
        name = n;
        hp = h;
    }

    void stimpack(){
        System.out.printf("[%s]의 스팀팩! HP: %d -> ", name, hp);
        hp -= 10;
        System.out.printf("%d\n", hp);
    }
}

class Medic{
    String name;
    int hp;
    int mp;

    Medic(String n, int h, int m){
        name = n;
        hp = h;
        mp = m;
    }

    void heal(Marine m, Medic m2){
        System.out.printf("[%s]의 치유! => [%s] HP(%d -> ", m2.name, m.name, m.hp);
        m.hp += 10;
        System.out.printf("%d)\n", m.hp);

        System.out.printf("[%s] MP: %d -> ", m2.name, m2.mp);
        m2.mp -= 10;
        System.out.printf("%d\n", m2.mp);
    }
}