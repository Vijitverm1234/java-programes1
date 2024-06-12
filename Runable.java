 class A implements Runnable{
    public void run(){
        System.out.println("entering the process A");
        for(int i=1;i<=5;i++){
            System.out.println("Process A : "+i);
        }
        System.out.println("Process A out");
    }
}
 class B implements Runnable{
    public void run(){
        System.out.println("entering the process B");
        for(int i=1;i<=5;i++){
            System.out.println("Process B : "+i);
        }
        System.out.println("Process B out");
    }
}
public class Runable {
    public static void main(String[] args) {
       A obj1=new A();
       B obj2=new B();
       Thread t1=new Thread(obj1);
       Thread t2=new Thread(obj2);
       t1.start();
       t2.start();

    }
}
