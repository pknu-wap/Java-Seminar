package OOP;
import java.util.Scanner;
public class InsertionSort {
    Person[] ps;
    int length=0;
    public InsertionSort(int n) {
        ps=new Person[n];
    }
    
    public void add(String name, int age) {
        ps[length]=new Person();
        ps[length].name=name;
        ps[length].age=age;
        length+=1;
    }
    
    public void sort() {
        for(int i=0;i<length;i++) {
            int t=i;
            for(int j=i+1;j<length;j++) {
                if(ps[t].age>ps[j].age)t=j;
            }
            if(t!=i)swap(i,t);
        }
    }
    
    public void swap(int ind1,int ind2) {
        Person tP=ps[ind2];
        ps[ind2]=ps[ind1];
        ps[ind1]=tP;
    }
    
    public void printAll() {
        for(int i=0;i<length;i++) {
            ps[i].print();
        }
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        InsertionSort in=new InsertionSort(N);
        for(int i=0;i<N;i++) {
            in.add(scan.next(), scan.nextInt());
        }
        
        in.printAll();
        in.sort();
        System.out.println("");
        in.printAll();
    }

}
class Person{
    String name;
    int age;
    public void print() {
        System.out.println(name + "("+ age +")");
    }
}