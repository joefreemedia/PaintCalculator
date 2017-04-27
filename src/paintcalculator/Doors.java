/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintcalculator;

/**
 *
 * @author geoffreytrenard
 */
public class Doors {
    private double doors;

    public double getDoors() {
        return doors;
    }

    public void setDoors(double doors) {
        this.doors = doors;
    }

    public Doors(double doors) {
        this.doors = doors;
    }

    public double doorsSqft() {
      return doors * 18; // Number of doors * 18sqft
    }
}
