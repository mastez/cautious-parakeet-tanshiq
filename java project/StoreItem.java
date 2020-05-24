import java.util.*;
public class  ReportGen{
    public static void main(String[] args){
        final Object[][] table = new String[4][];
table[0] = new String[] { "Exercise Class ", "No of Students" , "Income Generated" };
table[1] = new String[] { "Zumba", "12", "1200 GBP" };
table[2] = new String[] { "Yoga", "4", "400" };
table[3] = new String[] { "Aerobics", "3", "300" };

for (final Object[] row : table) {
    System.out.format("%15s%15s%15s\n", row);
}
    }
}