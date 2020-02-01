public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shapes shape1 = new ShapeFactory().getShapes(1);
        Shapes shape2 = new ShapeFactory().getShapes(2);
        Shapes shape3 = new ShapeFactory().getShapes(3);
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}