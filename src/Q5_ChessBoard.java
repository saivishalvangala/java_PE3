public class Q5_ChessBoard {
    public static void main(String[] args) {
        String chess[][] =new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+j)%2==0)
                    chess[i][j]="WW";
                else
                    chess[i][j]="BB";
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chess[i][j] + "|");
            }
            System.out.print("\n");
        }
    }
}
