public class App {

                  /****** Factory Pattern ******//*

                        How it Works

The client doesn't create shapes directly; it uses a ShapeFactory.
The client requests a shape type ("CIRCLE", "RECTANGLE") from the factory.
The ShapeFactory handles the logic of deciding which concrete shape to create.
The factory returns the newly created Shape object
The client can use the Shape object without knowing its concrete type.
                 */


    public static void main(String[] args) {

        ShapeFactory shapeFactory = new SimpleShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

    }
}