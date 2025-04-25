import java.util.ArrayList;
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
        ArrayList<Double> temperatures;
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
        while(temperatures > 37.5){
            isSick++;
            if(max < temperatures){
                max = temperatures;
            }
        }
        System.out.println("Number of fever cases reported: " + isSick);
        System.out.println("Heighest case of fever reported: " + max);
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