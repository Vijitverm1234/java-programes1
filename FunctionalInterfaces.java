
 interface Salary {
 void SalaryInfo();
static void Employee(){
    System.out.println("entered infomation are as follows");
}
}
public class FunctionalInterfaces implements Salary{
      public void SalaryInfo(){
        System.out.println("you are paid quite a good amount");
      }
    public static void main(String[] args) {
        FunctionalInterfaces f1=new FunctionalInterfaces();
        f1.SalaryInfo();
        Salary.Employee();
    }
}
