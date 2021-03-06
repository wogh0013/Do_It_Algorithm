package Chap03.Unit2;

public class GenericClassTester {
    static class GenericClass<T>{
        private T xyzc;

        GenericClass(T t){ //생성자
            this.xyzc = t;
        }

        T getXyz(){        //xyz 반환
            return xyzc;
        }
    }

    public static void main(String[] args) {
        //다음과 같이 파라미터에 String을 넘길 수도 있고, Integer를 넘길 수도 있다.
        GenericClass<String> s1 = new GenericClass<String>("ABC");
        GenericClass<Integer> n1 = new GenericClass<Integer>(99);

        System.out.println(s1.getXyz());
        System.out.println(n1.getXyz());
    }
}
