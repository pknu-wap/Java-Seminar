import java.util.Scanner;

public class Default{
    int[][] field=new int[19][19];//ºóÄ­ 0 Èæ 1 ¹é 2
    public int isCheck(int X,int Y,int turn) {
        int[] count=new int[8];
        int dirInd=0;
        for(int i=-1;i<2;i++) {
            for(int j=-1;j<2;j++) {
                if(i==0&&j==0) continue;
                for(int k=1;k<5;k++) {
                    if(Y+k*j<20&&X+k*i<20&&X+k*i>=0&&Y+k*j>=0&&field[X+k*i][Y+k*j]==turn) count[dirInd]+=1;
                    else break;
                }
                dirInd+=1;
            }
        }
        for(int i=0;i<4;i++) {
            if(count[i]+count[7-i]==4) return 1;
        }
        return 0;
    }
}