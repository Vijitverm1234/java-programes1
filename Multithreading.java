class A extends Thread{
    public void run(){
        System.out.println("Entrance of Process A");
        for(int i=1;i<=5;i++){
            System.out.println("Process A : "+ i);
        }
        System.out.println("Existance of Process A");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("Entrance of Process B");
        for(int i=1;i<=5;i++){
            System.out.println("Process B : "+ i);
        }
        System.out.println("Existance of Process B");
    }
}
class C extends Thread{
    public void run(){
        System.out.println("Entrance of Process C");
        for(int i=1;i<=5;i++){
            System.out.println("Process C : "+ i);
            if(i==3){
                try{
                    sleep(4000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
        System.out.println("Existance of Process C");
    }
}
public class Multithreading {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
