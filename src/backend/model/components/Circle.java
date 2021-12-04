package backend.model.components;

public abstract class Circle extends Ellipse {

    private final static String NAME = "Cuadrado";

    public Circle(Point centerPoint, double radius) {
        super(centerPoint, radius, radius);

    }

    public final double getRadius(){
        return this.getHeight();
    }

    @Override public final String identifier() { return NAME;}
}
