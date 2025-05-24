package arrays;

public class Demo {
    public static void update(int marks[], int nonChangeable) {
        for(int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }

        nonChangeable = 10;
    }
    public static void main(String[] args) {
        int marks[] = {98, 96, 93};
        int nonChangeable = 5;

        update(marks, nonChangeable);

        //print array
        for(int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        //print nonChangeable
        System.out.println(nonChangeable);
    }
}
