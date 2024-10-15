package app;

public class ServiceFigure {

    public static final double PI = 3.1415;
    public double pi = 3.1415;

    public double calculateRadius(double circleLength){
        double radius = circleLength / (2 * pi);
        return radius;
    }
}
