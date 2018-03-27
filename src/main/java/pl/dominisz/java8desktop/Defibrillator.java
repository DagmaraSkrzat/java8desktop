package pl.dominisz.java8desktop;

public class Defibrillator {

    int number;
    String name;
    String address;
    String phoneNumber;
    Point location;

    static Defibrillator createDefibrillator(String description) {
        String[] tokens = description.split(";");
        Defibrillator defibrillator = new Defibrillator();
        defibrillator.number = Integer.parseInt(tokens[0]);
        defibrillator.name = tokens[1];
        defibrillator.address = tokens[2];
        defibrillator.phoneNumber = tokens[3];
        defibrillator.location = new Point(ParseUtil.toDouble(tokens[4]),
                ParseUtil.toDouble(tokens[5]));
        return defibrillator;
    }

}
