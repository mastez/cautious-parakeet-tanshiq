import java.util.*;
public class  ReportGen {
    public static void main(String[] args){
        final Object[][] table = new String[6][];
table[0] = new String[] { "Exercise Class " ,"No of  Students " ," Average Rating" };
table[1] = new String[] { "Zumba", "4 ", "3" };
table[2] = new String[] { "Yoga", "12", "2" };
table[3] = new String[] { "Aerobics", "15", "4" };
table[4] = new String[] { "Box Fit", "10", "3" };
table[5] = new String[] { "Body Blitz", "8", "4" };



for (final Object[] row : table) {
        System.out.format("%15s%15s%15s\n", row);

}
    }
}