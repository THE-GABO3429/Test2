import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Quesiton_25 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quesiton_25_26_27
{
    // instance variables - replace the example below with your own
    private ArrayList<Double> temperatures;
    public Quesiton_25_26_27(){
        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(34.5);
        temperatures.add(39.5);
        temperatures.add(44.5);
        temperatures.add(24.5);
        temperatures.add(44.5);
        temperatures.add(38.5);
        fever(temperatures);
    }
    
    public void fever(ArrayList<Double> temperatures){
        int isSick = 0;
        double max = 0;
        for(Double temp : temperatures){
            if (temp > 37.5){
                isSick++;
            }
            if(max < temp){
                max = temp;
            }
        }
        System.out.println("Number of fever cases reported: " + isSick);
        System.out.println("Heighest case of fever reported: " + max);
        //question 26
        System.out.println("Higher fever case(Collection.max): " + Collections.max(temperatures));
        //question 27
        Collections.sort(temperatures);
        System.out.println("Higher fever case(Collection.sort): " + temperatures.getLast());
    }
}
/**
 * question 26
 * ArrayList<>().Collection.max;
 * return;
 * Question 27
 * ArrayList<>().Collection.sort;
 * int index.get();
 * System.out.println(index);
 */