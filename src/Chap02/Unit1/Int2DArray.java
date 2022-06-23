package Chap02.Unit1;

public class Int2DArray {
    public static void main(String[] args) {
        int[][] x = new int[2][4];

        x[0][1] = 33;
        x[0][3] = 21;
        x[1][2] = 7;

        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                System.out.println("x["+i+"]["+j+"]="+x[i][j]);
            }
        }
    }
}
