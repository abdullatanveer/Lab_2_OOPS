package rectanglerunner;

/**
 *
 * @author abdul
 */
public class recta {
    int length;
    int breadth;
     public recta(){
         
     }
     public void setarea(int l, int b){
         length=l;
         breadth=b;
     }
     public int area(){
         return length*breadth;
     }
     public void display(){
         System.out.println("Area of rectangle is "+ " " +area());
     }
    
}