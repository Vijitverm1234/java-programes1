class A extends Thread{
public void run(){
    System.out.println("=========Entrance of process A");
    for(int i=0;i<=5;i++){
        System.out.println("Process A : "+i);
    }
    System.out.println("=========Exit of process A");
}
}
class B extends Thread{
    public void run(){
        System.out.println("=========Entrance of process B");
        for(int i=0;i<=5;i++){
            if(i==4){
                try {
                    
                    } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("Process B : "+i);
        }
        System.out.println("=========Exit of process B");
    }
    }
    class C extends Thread{
        public void run(){
            System.out.println("=========Entrance of process C");
            for(int i=0;i<=5;i++){
                System.out.println("Process C : "+i);
            }
            System.out.println("=========Exit of process C");
        }
        }
class MultiThreading1{
public static void main(String[] args) {
    A threadA=new A();
    B threadB=new B();
    C threadC=new C();
    threadA.setPriority(1);
    threadB.setPriority(2);
    threadC.setPriority(3);
    threadA.start();
    threadB.start();
    threadC.start();
}
}