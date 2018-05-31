import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan=new     Scanner(System.in);
        int N=scan.nextInt();
        String[] names=new String[N];
        int[] ages=new int[N];
        for(int i=0;i<N;i++) {
            names[i]=scan.next();
            ages[i]=scan.nextInt();
        }
        for(int i=0;i<N;i++) {
            System.out.println(names[i] + "("+ ages[i] +")");
        }
        for(int i=0;i<N;i++) {
            int t=i;
            for(int j=i+1;j<N;j++) {
                if(ages[t]>ages[j])t=j;
            }
            if(t!=i) {
                String tName=names[i];
                int tAge=ages[i];
                names[i]=names[t];
                ages[i]=ages[t];
                names[t]=tName;
                ages[t]=tAge;
            }
        }
        System.out.println("");
        for(int i=0;i<N;i++) {
            System.out.println(names[i] + "("+ ages[i] +")");
        }
    }
}