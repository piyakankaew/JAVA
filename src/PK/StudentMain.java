package PK;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class StudentMain {
    public static void main(String[] args) {

        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setRoundingMode(RoundingMode.CEILING);

        Student s1 = new Student(1,"Sara");
        Student s2 = new Student(2,"Josh");

        s1.setMidtermScore(10.33);
        s1.setFinalScore(20.1);

        s2.setMidtermScore(11);
        s2.setFinalScore(22.6);


        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("Score: " + df2.format(s1.getTotalScore()));
        System.out.println("-----------------------------------------------");

        System.out.println("ID: " + s2.getId());
        System.out.println("Name: " + s2.getName());
        System.out.println("Score: " + df2.format(s2.getTotalScore()));
        System.out.println("-----------------------------------------------");
    }
}
