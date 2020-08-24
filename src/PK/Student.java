package PK;

public class Student {
    //1.field
    private int id;
    private String name;
    private double midtermScore;
    private double finalScore;

    //2.constructor
    public Student(int id,String name){
        this.id=id;
        this.name=name;
//        this.midtermScore=midtermScore;
//        this.finalScore=finalScore;
    }

    //3.method
    double getTotalScore(){
        double total = midtermScore + finalScore;
        return total;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setMidtermScore(double midtermScore) {
        this.midtermScore = midtermScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }
}
