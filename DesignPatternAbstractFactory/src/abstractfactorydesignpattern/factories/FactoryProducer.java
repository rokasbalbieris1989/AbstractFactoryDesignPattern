/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydesignpattern.factories;

/**
 *
 * @author me
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
    
    public static AbstractFactory getShapeColorFactory(){
        return new ShapeColorFactory();
    }
}
