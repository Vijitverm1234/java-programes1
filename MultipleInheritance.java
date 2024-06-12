interface bird{
    public void birdname();
}
interface birdinfo{
    public void birddes();
}
class birdmain implements bird, birdinfo{
    public void birdname(){
        System.out.println("Enter bird is Chandelier ");
    }
    public void birddes(){
        System.out.println("This bird can fly higher idk why");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        birdmain obj=new birdmain();
        obj.birdname();
        obj.birddes();
    }
}
