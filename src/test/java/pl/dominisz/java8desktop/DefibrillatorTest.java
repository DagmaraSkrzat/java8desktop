package pl.dominisz.java8desktop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefibrillatorTest {

    @Test
    void createDefibrillator() {

        String stringTestowy = "5;Defi1;Racławickie 5;86-483-28;64,7;82,3";

//        private int number;
//        private String name;
//        private String address;
//        private String phoneNumber;
//        private Point location;

        //Jeśli chcemy sprawdzić czy utworzony obiekt za pomoc metody createDefibrillator jest poprawny, należy sprawdzić każde jego
        //pole (tego obiektu) zapomocą geterów czy są poprawne

        assertEquals(5, Defibrillator.createDefibrillator(stringTestowy).getNumber());
        assertEquals("Defi1", Defibrillator.createDefibrillator(stringTestowy).getName());
        assertEquals("Racławickie 5", Defibrillator.createDefibrillator(stringTestowy).getAddress());
        assertEquals("86-483-28", Defibrillator.createDefibrillator(stringTestowy).getPhoneNumber());
        assertEquals(new Point(64.7, 82.3), Defibrillator.createDefibrillator(stringTestowy).getLocation());

    }
}