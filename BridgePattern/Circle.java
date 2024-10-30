package BridgePattern;

public class Circle extends Shape{
    private double x, y, radius;

    public Circle(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);  // Utilisation de l'API de dessin
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
