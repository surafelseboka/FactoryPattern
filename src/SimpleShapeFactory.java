public class SimpleShapeFactory extends ShapeFactory{

    @Override
    public Shape getShape(String shapeType) {
       if (shapeType == null){
           return null;
       }

        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return null;
    }
}
