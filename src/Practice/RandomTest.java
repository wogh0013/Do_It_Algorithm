package Practice;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //배열 생성
        int[] counts = new int[13]; //0~12

        //변수 생성 및 주사위 100번 던지기
        for(int i=0; i<100; i++){
            int a = DieA.roll();
            int b = DieB.roll();
            counts[a+b]++;
        }

        //결과 출력
        for(int row=2; row<counts.length; row++){ //2~12
            System.out.printf("%d => ", row);
            //#을 출력
            for(int col=0; col<counts[row]; col++){
                System.out.printf("#");
            }
            System.out.println();
        }
    }
}

class DieA{
    public static int roll(){
        //1부터 6사이 정수를 반환
        double r = Math.random() * 6; // 0.0 <= r < 6.0
        int randInt = (int) r; // 0~5
        return randInt + 1; // 1~6
    }
}

class DieB{
    public static int roll(){
        //자바 API 사용
        Random rand = new Random();
        int randInt = rand.nextInt(6); //0~5
        return randInt + 1;
    }
}