import java.util.ArrayList;

public class Latihan1WrapperClass {
    public static void main(String[] args) {

        // ArrayList String berisi angka
        ArrayList<String> listString = new ArrayList<>();
        listString.add("10");
        listString.add("20");
        listString.add("30");

        // ArrayList Integer hasil konversi
        ArrayList<Integer> listInteger = new ArrayList<>();

        // Konversi String ke Integer
        for (String s : listString) {
            Integer angka = Integer.parseInt(s); // wrapper class
            listInteger.add(angka); // autoboxing
        }

        // Output
        System.out.println("ArrayList String  : " + listString);
        System.out.println("ArrayList Integer : " + listInteger);
    }
}
