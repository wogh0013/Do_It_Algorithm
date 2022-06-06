package Practice;

public class PlayerTest {
    public static void main(String[] args) {
        //점수 배열 생성
        int[] points0 = {10,9,9,8};
        int[] points1 = {9,10,9,9};
        int[] points2 = {10,9,10,10};

        //선수 객체 생성
        Player p0 = new Player("Kim", points0);
        Player p1 = new Player("Lee", points1);
        Player p2 = new Player("Park", points2);

        //객체 배열 만들기
        Player[] players = {p0, p1, p2};

        //선수별 총점 출력
        for(int i=0; i<players.length; i++){
            players[i].printTotalPoints();
        }
    }
}

class Player{
    //필드
    String name;
    int[] points;

    //생성자
    Player(String str, int[] arr){
        name = str;
        points = arr;
    }

    //메서드
    void printTotalPoints(){
        System.out.printf("%s -> %d점\n", name, totalPoints());
    }

    int totalPoints(){
        int sum=0;
        for(int i=0; i<points.length; i++){
            sum += points[i];
        }
        return sum;
    }
}
