package pl.dominisz.java8desktop;

public class Defibrillator {

    private int number;
    private String name;
    private String address;
    private String phoneNumber;
    private Point location;

    public static Defibrillator createDefibrillator(String description) {
        String[] tokens = description.split(";");
        Defibrillator defibrillator = new Defibrillator();
        defibrillator.number = Integer.parseInt(tokens[0]);
        defibrillator.name = tokens[1];
        defibrillator.address = tokens[2];
        defibrillator.phoneNumber = tokens[3];
        defibrillator.location = new Point(ParseUtil.toDouble(tokens[4]), ParseUtil.toDouble(tokens[5]));
        return defibrillator;
    }

    public String getName() {
        return name;
    }

    public Point getLocation() {
        return location;
    }

    public int getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
