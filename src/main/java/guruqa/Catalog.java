package guruqa;


public class Catalog {
    public static void main(String[] args) {

        Smartphones samsung = new Smartphones();
        samsung.setName("Samsung Galaxy");
        samsung.setOperatingSystem("Android 11");
        samsung.setThereIs5G(true);
        samsung.setMemorySize(256);
        samsung.setPrice(60000);

        Smartphones apple = new Smartphones();
        apple.setName("iPhone 13");
        apple.setOperatingSystem("iOS 15");
        apple.setThereIs5G(true);
        apple.setMemorySize(256);
        apple.setPrice(90000);

        Tablet iPad = new Tablet();
        iPad.setNameTablet("iPad Air");
        iPad.setOperatingSystemTablet("iOS");
        iPad.setScreenDiagonal(10.9);
        iPad.setPrice(53000);

        System.out.println(samsung);
        System.out.println(apple);
        System.out.println(iPad);

        Notebook lenovo = new Notebook();
        System.out.println(lenovo);

    }
}
