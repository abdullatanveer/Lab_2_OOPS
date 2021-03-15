package carrunner;

/**
 *
 * @author abdul
 */
public class car {
    String name;
    String color;
    String model;
    int price;
    public void moving(){
        System.out.println("Car is moving with very high velocity");
        
    }
    public void slow(){
        System.out.println("CAAR is very slow....");
    }
    public void display(){
         System.out.println("CAR name is "+" "+name+"\n "+"car color is "+" "+color+" \n"+"car price is "+" "+price+" \n"+"car model is"+" " +model);
        
    }
    
}
