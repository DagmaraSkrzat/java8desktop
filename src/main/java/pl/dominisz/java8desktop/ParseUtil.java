package pl.dominisz.java8desktop;

public class ParseUtil {

    //metoda zamienia podany string na typ double
    static double toDouble(String number) {
        return Double.parseDouble(number.replace(',', '.'));
    }


}
