/**
 * Number
 */
 interface Number {
 boolean test(int n);
    
}
public class Lambda1 {

    public static void main(String[] args) {
    Number isTest=(n)->(n%2)==0;
    if(isTest.test(10)){
        System.out.println("given number is even");
    }
    else{
        System.out.println("given number is odd");
    } 

    }
}
