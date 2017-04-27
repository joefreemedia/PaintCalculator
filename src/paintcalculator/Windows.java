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
public class Windows {
    private double windows;

    public double getWindows() {
        return windows;
    }

    public void setWindows(double windows) {
        this.windows = windows;
    }

    public Windows(double windows) {
        this.windows = windows;
    }
   
    public double windowsSqft(){
        return windows * 12; // number of windows times 12 square feet
    }
}
