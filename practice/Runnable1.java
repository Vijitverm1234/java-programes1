class A implements Runnable{
    public void run(){
        System.out.println("Entry of process A");
        for(int i=1;i<=5;i++){
            System.out.println(i+". Process A");
        }
        System.out.println("Exit process A");
    }
}
class B implements Runnable{
    public void run(){
        System.out.println("Entry of process B");
        for(int i=1;i<=5;i++){
            System.out.println(i+". Process B");
        }
        System.out.println("Exit process B");
    }
}
public class Runnable1 {
    public static void main(String[] args) {
      A obj1=new A();
      B obj2=new B();
      Thread t1=new Thread(obj1);
      Thread t2=new Thread(obj2);
      t1.start();
      t2.start();
    }
}
