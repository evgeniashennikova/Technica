package guruqa;

public class Notebook {

    private int idNotebook;
    private String name;

    public Notebook() {

        this.idNotebook = 123;
        this.name = "Lenovo";

    }

    public int getIdNotebook() {
        return idNotebook;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ноутбук" + "\t" + idNotebook + " " + name;

    }
}

