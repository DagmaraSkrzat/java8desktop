package pl.dominisz.java8desktop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {


    public static void main(String args[]) {
        //System.err.println(toDouble("1,2345"));
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();

        Point userLocation = new Point(ParseUtil.toDouble(LON), ParseUtil.toDouble(LAT));
        User user = new User(userLocation);

        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        List<Defibrillator> defibrillators = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            Defibrillator defibrillator = Defibrillator.createDefibrillator(DEFIB);
            defibrillators.add(defibrillator);
        }
        Defibrillator nearest = findNearest(user, defibrillators);
        System.out.println(nearest.getName());

}
    public static Defibrillator findNearest(User user,
                                     List<Defibrillator> defibrillators) {
        Defibrillator minDefibrillator = defibrillators.get(0);
        double minDistance = user.getLocation()
                .distanceTo(minDefibrillator.getLocation());
        for (int i = 1; i < defibrillators.size(); i++) {
            double distance = user.getLocation()
                    .distanceTo(defibrillators.get(i).getLocation());
            if (distance < minDistance) {
                minDistance = distance;
                minDefibrillator = defibrillators.get(i);
            }
        }
        return minDefibrillator;
    }
}