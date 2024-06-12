class Printing{
    synchronized  void print(char x){
        for(int i=0;i<=5;i++){
           for(int j=0;j<=i;j++){
        System.out.print(x);
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
p.print('X');
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
public class Syn {
    public static void main(String[] args) {
        Printing obj=new Printing();
        A threadA=new A(obj);
        B threadB=new B(obj);
        threadA.start();
        threadB.start();
    }
}
