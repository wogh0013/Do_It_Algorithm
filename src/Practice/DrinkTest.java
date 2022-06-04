package Practice;

public class DrinkTest {
    public static void main(String[] args) {

        //디폴트 생성자로 객체 생성
        Drink d1 = new Drink(); //디폴트 생성자가 없다면 ERROR !!
        d1.name = "포카리";
        d1.price = 1000;

        //다른 생성자로 객체 생성
        Drink d2 = new Drink("박카스", 800);

        //객체 출력
        System.out.println(d1.toStr());
        System.out.println(d2.toStr());
    }
}

class Drink{
    String name;
    int price;

    //디폴트 생성자
    Drink(){ }

    Drink(String n, int p){
        name = n;
        price = p;
    }

    //메서드
    String toStr(){
        return String.format("Drink {name: %s, price: %d}", name, price);
    }
}
