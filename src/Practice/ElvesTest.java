package Practice;

import java.util.ArrayList;

public class ElvesTest {
    public static void main(String[] args) {

        //엘프 객체 생성 - 업캐스팅 (자식 클래스를 부모 타입으로 해석 가능)
        // Elf - HighElf - ElfLord 순서니까!
        Elf t = new Elf("티란데", 100);
        Elf m = new HighElf("말퓨리온", 160, 100);
        Elf e = new ElfLord("마이에브", 230, 140, 100);

        /* 1. 객체 배열 생성
        Elf[] elves = {t, m, e};

        for(int i=0; i<elves.length; i++){
            System.out.println(elves[i].toString());
        }
        */

        // 2. ArrayList 활용
        ArrayList<Elf> elves = new ArrayList<>();
        elves.add(t);
        elves.add(m);
        elves.add(e);

        for(int i=0; i<elves.size(); i++){
            System.out.println(elves.get(i).toString());
        }
    }
}

class Elf{
    protected String name;
    protected int hp;

    public Elf(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String toString(){
        return String.format("[엘프] Name: %s, HP: %d", name, hp);
    }
}

class HighElf extends Elf{
    protected int mp;

    public HighElf(String name, int hp, int mp){
        super(name, hp);
        this.mp = mp;
    }

    public String toString(){
        return String.format("[하이엘프] Name: %s, HP: %d, MP: %d", name, hp, mp);
    }
}

class ElfLord extends HighElf{
    protected int shield;

    public ElfLord(String name, int hp, int mp, int shield){
        super(name, hp, mp);
        this.shield = shield;
    }

    public String toString(){
        return String.format("[엘프로드] Name: %s, HP: %d, MP:%d", name, hp, mp, shield);
    }
}
