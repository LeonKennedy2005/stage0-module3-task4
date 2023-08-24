package school.mjc.stage0.module3.task4;

public class IntRepresentation {
    public static void main(String[] args) {
        int[] chars = {'c', 'h', 'a', 'r'};

        for (int intValue : chars) {
            char charValue = (char) intValue;
            System.out.print(charValue);
        }
    }
}
