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
                + price + "руб."+"\n";
    }

    public void setName(String name) {
        this.name = name;
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


