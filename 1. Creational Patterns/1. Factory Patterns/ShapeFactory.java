public class ShapeFactory {
    public Shapes getShapes(int type) {
        switch (type) {
        case 1:
            return new Circle();
        case 2:
            return new Rectangle();
        case 3:
            return new Square();
        default:
            return null;
        }
    }
}