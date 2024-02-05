import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        int ogSize = numList.size();
        for (int i = 0; i < ogSize; i++) {
            numList.add(numList.get(i));
        }

        System.out.println(numList);
    }
}