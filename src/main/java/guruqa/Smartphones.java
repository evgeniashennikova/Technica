package guruqa;

public class Smartphones {

    private String name;
    private String operatingSystem;
    private boolean thereIs5G;
    private int memorySize;
    private int price;

    @Override
    public String toString() {
        return "Характеристики смартфона:" + name + "\n"
                + operatingSystem + "\n"
                + "5G" + "\t" + thereIs5G + "\n"
                + memorySize + "ГБ" + "\n"
                + price + "руб." + "\n";
    }

    public void outputOfInfoFromCatalog() {
        if (name == null) {
            System.out.println("В каталоге нет данного товара!\n");
        } else {
            System.out.println(this);
        }
    }


    public void setName(String name) {
        if ("Nokia".equals(name)) {
            System.out.println("Мы не продаём Nokia");
        } else {
            this.name = name;
        }
    }

    public void sendSms(String textSms) {
        System.out.println("Отправленное смс с телефона:" + name + "\n" + textSms);
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setThereIs5G(boolean thereIs5G) {
        this.thereIs5G = thereIs5G;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public boolean isThereIs5G() {
        return thereIs5G;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getPrice() {
        return price;
    }


}


