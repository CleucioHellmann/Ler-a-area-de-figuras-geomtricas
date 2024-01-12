package entities;
import entitiesEnums.Color;

public abstract class Shape {

    private Color color;

    //  Abaixo construtor vazio
    public Shape(){
    }

    //  Abaixo construtor com argumento
    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area ();
}

