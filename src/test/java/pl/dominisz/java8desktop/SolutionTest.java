package pl.dominisz.java8desktop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findNearest() {
        User user = new User(new Point(0, 0));
        Defibrillator def1 = Defibrillator.createDefibrillator("1;Defi1;Racławickie 5;86-483-28;0;10");
        Defibrillator def2 = Defibrillator.createDefibrillator("2;Defi2;Racławickie 6;86-483-29;0;20");
        Defibrillator def3 = Defibrillator.createDefibrillator("3;Defi3;Racławickie 7;86-483-30;0;30");

        List<Defibrillator> listaDefibrylatorow = new ArrayList<>();
        listaDefibrylatorow.add(def1);
        listaDefibrylatorow.add(def2);
        listaDefibrylatorow.add(def3);

        assertEquals(def1, Solution.findNearest(user, listaDefibrylatorow));

    }

//    public static Defibrillator findNearest(User user, List<Defibrillator> defibrillators) {
//        Defibrillator minDefibrillator = defibrillators.get(0);
//        double minDistance = user.getLocation()
//                .distanceTo(minDefibrillator.getLocation());
//        for (int i = 1; i < defibrillators.size(); i++) {
//            double distance = user.getLocation()
//                    .distanceTo(defibrillators.get(i).getLocation());
//            if (distance < minDistance) {
//                minDistance = distance;
//                minDefibrillator = defibrillators.get(i);
//            }
//        }
//        return minDefibrillator;
//    }
}