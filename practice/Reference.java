/**
 * InnerReference
 */

public class Reference {
   public  void display(){
    System.out.println("enter the information");
   }
   public static void main(String[] args) {
    Thread t1=new Thread(new Reference()::display);
    t1.start();
   }
}
