package pl.dominisz.java8desktop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point testPoint1 = new Point(3.4, 6.7);
    Point testPoint2 = new Point(3.4, 10.0);
    Point testPoint3 = new Point(2.7, 10.0);

    //test dla dwóch punktów o tej samej współrzędnej X, czy leżące w tej samej długości geograficznej, ale różnej szerokości:
    @Test
    void distanceToTheSameLongtitude() {
        double x = (3.4 - 3.4) * Math.cos((6.7 + 10.0) / 2);
        double y = (10.0 - 6.7);
        double d = Math.sqrt((x * x) + (y * y)) * 6371;
        assertEquals(d, testPoint1.distanceTo(testPoint2));
    }

    //test dla dwóch punktów o tej samej współrzędnej Y, czy leżące w tej samej szerokości geograficznej, ale różnej długości:
    @Test
    void distanceToTheSameLatitude() {
        double x = (3.4 - 2.7) * Math.cos((10.0 + 10.0) / 2);
        double y = (10.0 - 10.0);
        double d = Math.sqrt((x * x) + (y * y)) * 6371;
        assertEquals(d, testPoint2.distanceTo(testPoint3));
    }

    //odległość punktu od siebie samego:
    @Test
    void distanceToTheSamePoint() {
        assertEquals(0, testPoint1.distanceTo(testPoint1));
    }

    //odległość punktu od punktu zerowego:
    @Test
    void distanceToZeroPoint() {
        Point a = new Point(0.0, 0.0);
        Point b = new Point(100.0, 100.0);

        double x = (100 - 0) * Math.cos((0 + 100) / 2);
        double y = (100 - 0);
        double d = Math.sqrt((x * x) + (y * y)) * 6371;

        assertEquals(d, b.distanceTo(a));
    }

}