
import java.util.Scanner;;
public class Rectangle{
	private int lenght;
	private int breadth;
	
	Rectangle(int lenght, int breadth){	
		this.lenght=400;
		this.breadth=400;
	}
    public void setLength(int lenght){
        this.lenght = lenght;
    }

    public void setBreadth (int breadth){
        this.breadth = breadth;
    }

    public int areaOfRectangle(int lenght, int breadth){
        return lenght * breadth;
    }




class RectangleTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();
        Rectangle r = new Rectangle(l, b);
        
        System.out.println("Area of rectangle: ");

        System.out.println("Enter length: ");
        int l1 = sc.nextInt();
        r.setLength(l1);
        System.out.println("Enter breadth: ");
        int b1 = sc.nextInt();
        r.setBreadth(b1);
        System.out.println("New Area of rectangle: "+ r.areaOfRectangle(l1, b1));
    }
}


}

