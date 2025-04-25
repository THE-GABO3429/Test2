
/**
 * Write a description of class Comparing2StrinngAsEquall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comparing2StrinngAsEquall
{
    // instance variables - replace the example below with your own
    private String a;
    private String b;
    /**
     * Constructor for objects of class Comparing2StrinngAsEquall
     */
    public void Comparing2StrinngAsEquall(String a, String b)
    {
        // initialise instance variables
        a += 0;
        b += 3;
        while(true){
            if(!(a==b)){
                a = b;
                if(a==b){
                    System.out.println(a + " & " + b + " are the same value.");
                    break;
                }
                System.out.println(a + " & " + b + " are not the same value.");
            }  
        }
    }
}
