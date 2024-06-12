class Printing{
   synchronized void print(char ch){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
class A extends Thread{
    Printing p;
    A(Printing p){
        this.p=p;
    }
    public void run(){
       p.print('*');
    }
}
class B extends Thread{
    Printing p;
    B(Printing p){
        this.p=p;
    }
    public void run(){
       p.print('#');
    }
}
public class Synchronization {
    public static void main(String[] args) {
        Printing obj=new Printing();
        A thread1=new A(obj);
        B thread2=new B(obj);
        thread1.start();
        thread2.start();
    }
}
