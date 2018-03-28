package pl.dominisz.java8desktop;

import static com.sun.org.apache.bcel.internal.Repository.instanceOf;

public class Point {

    final double EARTH_RADIUS = 6371.0;

    private double longitude;
    private double latitude;

    public Point(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double distanceTo(Point B) {
        double x = (B.longitude - longitude) * Math.cos((latitude + B.latitude) / 2);
        double y = B.latitude - latitude;
        double d = Math.sqrt(x * x + y * y) * EARTH_RADIUS;
        return d;
    }


    //nadpisujemy metodę equals, ponieważ w klasie DefibrillatorTest przy porównywaniu lokacji defibrylatora potrzebujemy porównania
    //dwóch obiektów typu Point (bez nadpisania metody equals porównywałoby nam obiekty za pomocą ==, a to prowadzi do porównania
    //jedynie adresów obiektów, a te są różne
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return longitude == point.longitude && latitude == point.latitude;
        } else {
            return false;
        }
    }

}
