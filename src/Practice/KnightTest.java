package Practice;

public class KnightTest {
    public static void main(String[] args) {
        Knight k1 = new Knight("돈키호테", 30);
        System.out.println("[객체 생성]");
        System.out.println("    " + k1.toStr());

        //Setter를 이용한 방법
//        k1.setHp(60);

        //Setter와 Getter를 이용한 방법
        k1.setHp(k1.getHp() + 30);

        System.out.println("[체력 증가]");
        System.out.println("    " + k1.toStr());
    }
}

class Knight{
    private String name;
    private int hp;

    public Knight(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getHp(){
        return this.hp;
    }

    public String toStr(){
        return String.format("Knight { name: %s, hp: %d }", this.name, this.hp);
    }
}
