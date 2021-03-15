package carrunner;

/**
 *
 * @author abdul
 */
public class Carrunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        car c1=new car();
        c1.name="Ferrari";
        c1.color="red";
        c1.model="F32";
        c1.price=45000;
        c1.slow();
        c1.display();
    }
    
}