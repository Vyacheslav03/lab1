package bsu.rfe.java.group7.lab1.Chikilev.var10;

public class Cake extends Food{
    private String icing;

    public Cake(String icing) {
        super("Пироженое");
        this.icing = icing;
    }
    public void consume() {
        System.out.println(this + " съедено");
    }
    public void setSize(String size) {
        this.icing = icing;
    }
    public String getSize() {
        return icing;
    }
    public String toString() {
        return super.toString() + " с глазурью '" + icing.toUpperCase() + "'";
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Cake)) return false; // Шаг 2
            return icing.equals(((Cake)arg0).icing); // Шаг 3
        } else
            return false;
    }
    public int calculateCalories() {
        int calories = 0;
        if(icing.equals("шоколадное")) {
            calories+= 50;
        } else if(icing.equals("сливочная")){
            calories+=10;
        }else{
            calories+=5;
        }
        return calories;
    }
    public int lenght() {
        int Lenght = 0;
        if(icing.equals("шоколадное")) {
            Lenght = 20;

        } else if(icing.equals("сливочная")){
            Lenght = 19;
        }else{
            Lenght = 21;
        }
        return Lenght;
    }
}
