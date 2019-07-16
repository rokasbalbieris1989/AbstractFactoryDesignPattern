/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydesignpattern.factories;

import abstractfactorydesignpattern.colors.Blue;
import abstractfactorydesignpattern.colors.Color;
import abstractfactorydesignpattern.colors.Green;
import abstractfactorydesignpattern.colors.Red;
import abstractfactorydesignpattern.shapes.Circle;
import abstractfactorydesignpattern.shapes.Rectangle;
import abstractfactorydesignpattern.shapes.Shape;
import abstractfactorydesignpattern.shapes.Square;

/**
 *
 * @author me
 */
public class ShapeColorFactory extends AbstractFactory {
    public ShapeColorFactory() {
    }

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
