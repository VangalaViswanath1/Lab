class A{
    void gparent(){
        System.out.println("He has the 'Kawasaki' Bike....");
    }
}
class B extends A{
    void son(){
        System.out.println("Son has 'Audi' car....");
    }
}
class C extends B{
    void gson(){
        System.out.println("Grand son has 'Tesla' car.... ");
    }
}

public class Parent {
    public static void main(String args[]){
        C c1 = new C();
        c1.gparent();
        c1.gson();
        c1.son();
    }
}
