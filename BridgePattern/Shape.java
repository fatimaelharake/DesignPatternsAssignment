package BridgePattern;

public abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();  // Méthode pour dessiner la forme
    public abstract void resize(double factor);  // Méthode pour redimensionner
}
