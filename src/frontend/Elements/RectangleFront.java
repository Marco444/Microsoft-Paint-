package frontend.Elements;

import backend.model.Point;
import backend.model.Rectangle;
import javafx.scene.canvas.GraphicsContext;

public class RectangleFront extends Rectangle implements FrontRectangle{
    private GraphicsContext gc;
    public RectangleFront(Point topLeft, Point bottomRight,GraphicsContext gc) {
        super(topLeft,bottomRight);
        this.gc=gc;
    }

    @Override
    public void display() {
        print(gc,this.getTopLeft(),this.getWidth(),this.getHeight());
    }
}
