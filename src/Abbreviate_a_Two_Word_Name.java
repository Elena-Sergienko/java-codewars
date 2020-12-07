// 8 kyu
// Abbreviate a Two Word Name
// Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
// The output should be two capital letters with a dot separating them.
// It should look like this:
// Sam Harris => S.H
// Patrick Feeney => P.F

public class Abbreviate_a_Two_Word_Name {
    public static String abbrevName(String name) {
        return (name.charAt(0) + "." + name.charAt(name.indexOf(" ")+1)).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris")); // "S.H"
    }
}
