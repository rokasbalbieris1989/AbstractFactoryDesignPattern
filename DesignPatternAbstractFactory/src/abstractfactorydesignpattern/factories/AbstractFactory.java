/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydesignpattern.factories;

import abstractfactorydesignpattern.colors.Color;
import abstractfactorydesignpattern.shapes.Shape;

/**
 *
 * @author me
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
