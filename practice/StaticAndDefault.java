/**
 * InnerStaticAndDefault
 */
interface Info {
default void getInfo1(){
    System.out.println("Information 1");
}
static void getInfo2(){
    System.out.println("Information 1");
}
  
    
}
public class StaticAndDefault implements Info {
  
  public void getInfo1() {
      System.out.println("Information 3");
  }
    public static void main(String[] args) {
        StaticAndDefault obj =new StaticAndDefault();
        obj.getInfo1();
        Info.getInfo2();
    }
}
