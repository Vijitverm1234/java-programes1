class Circle{
float radius=0.0f;
synchronized void output(){
    System.out.println("============output invoked==========");
    if(radius==0.0){
        System.out.println("Waiting for the input ");
        try {
            wait();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    System.out.println("Area : "+3.14*radius*radius);
}
synchronized void input(float r){
System.out.println("Taking input value ");    
radius=r;
System.out.println("Radius value retrieved");
notify();
}

}

public class WaitAndNotify {
    public static void main(String[] args) {
        final Circle c=new Circle();
        new Thread(){
            public void run(){
                c.output();
            }
        }.start();
        new Thread(){
            public void run(){
                c.input(2.5f);
            }
        }.start();
    }
}
