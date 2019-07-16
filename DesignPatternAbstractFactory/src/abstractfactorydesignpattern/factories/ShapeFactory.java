/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydesignpattern.factories;

import abstractfactorydesignpattern.shapes.Circle;
import abstractfactorydesignpattern.colors.Color;
import abstractfactorydesignpattern.shapes.Rectangle;
import abstractfactorydesignpattern.shapes.Shape;
import abstractfactorydesignpattern.shapes.Square;

/**
 *
 * @author me
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }
        
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

}
