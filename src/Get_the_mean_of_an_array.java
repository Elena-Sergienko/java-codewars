// 8 kyu
// Get the mean of an array
// It's the academic year's end, fateful moment of your school report. The averages must be calculated. All the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a script.
// Return the average of the given array rounded down to its nearest integer.
// The array will never be empty.

public class Get_the_mean_of_an_array {

    public static int getAverage(int[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }


    public static void main(String[] args) {
        System.out.println(getAverage(new int[]{2, 2, 2, 2}));
    }
}
