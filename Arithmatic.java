

class Arithmatic1{
    public int add(int a, int b){
        return(a+b);
    }
}

class adder extends Arithmatic1{

}


public class Arithmatic{

    public static void main(String args[]){
        Arithmatic1 A1= new  Arithmatic1();
        System.out.println(A1.add(11, 44));

    }
}