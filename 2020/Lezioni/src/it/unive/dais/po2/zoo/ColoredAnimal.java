package it.unive.dais.po2.zoo;

public abstract class ColoredAnimal<A extends Animal> extends Animal<A> {
    protected String color;

    protected ColoredAnimal(int w, String c, A p) {
        super(w, p);
        this.color = c;
    }

}
