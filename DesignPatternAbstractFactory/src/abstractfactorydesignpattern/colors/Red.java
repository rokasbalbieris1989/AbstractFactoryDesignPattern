/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydesignpattern.colors;

/**
 *
 * @author me
 */
public class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
    
}
