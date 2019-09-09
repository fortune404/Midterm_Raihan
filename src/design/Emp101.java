package design;

public abstract class Emp101 implements Employee
{
    final String empName = "Post Malone";
    static String resignationDate = " 10/10/19";
    int rating;

    //Method overloading
    public void performance (){}

    public void performance(String rating) {}

    public void farewell(){}

    public void farewell(int date) {}

}
