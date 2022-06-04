package Practice;

public class HeroTest {
    public static void main(String[] args) {
        //객체 생성
        Hero thor = new Hero("토르", 150);
        Hero thanos = new Hero("타노스", 160);

        //토르의 펀치 -> 타노스
        thor.punch(thanos);
        thor.punch(thanos);

        //타노스의 펀치 -> 토르
        thanos.punch(thor);
    }
}

class Hero{
    String name;
    int hp;

    Hero(String n, int h){
        name = n;
        hp = h;
    }

    void punch(Hero enemy){
        System.out.printf("[%s]의 펀치!! ", name);

        //펀치를 맞은 객체 출력
        System.out.printf("%s의 HP: %d -> ", enemy.name, enemy.hp);
        enemy.hp -= 10;
        System.out.printf("%d\n", enemy.hp);
    }
}
