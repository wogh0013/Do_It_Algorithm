package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimpleLottoMachine {
    public static void main(String[] args) {
        //45개의 공을 만든다.
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=1; i<=45; i++){
            numbers.add(i); //1~45의 정수를 numbers에 담음
        }

        //공을 섞는다. (ArrayList를 랜덤으로 섞어주는 자바 API)
        Collections.shuffle(numbers);

        //공을 뽑는다.
        int[] picked = new int[6]; //6칸의 배열을 먼저 생성해줌
        for(int i=0; i<picked.length; i++){ //numbers의 앞 6개 숫자를 가져옴
            picked[i] = numbers.get(i); //ArrayList의 i번째 요소를 picked의 i번째 요소에 담음
        }

        //결과 출력 (ArrayList를 반환해주는 자바 API)
        System.out.println("자동 생성 번호 : " + Arrays.toString(picked));
    }
}
