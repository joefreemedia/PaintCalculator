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
public class RoomSize {
    private double length;
    private double width;
    private double windows;
    private double doors;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWindows() {
        return windows;
    }

    public void setWindows(double windows) {
        this.windows = windows;
    }

    public double getDoors() {
        return doors;
    }

    public void setDoors(double doors) {
        this.doors = doors;
    }

    public RoomSize(double length, double width, double windows, double doors) {
        this.length = length;
        this.width = width;
        this.windows = windows;
        this.doors = doors;
    }
    
        public double getPerimeter(){
        return 2 * (length + width);
    }
    
    public double roomSqft() {
        return getPerimeter() * 8; // Total area is the perimeter time 8 ft tall walls
    }

    public double windowsSqft(){
        return windows * 12; // number of windows times 12 square feet
    }
    
    public double doorsSqft() {
      return doors * 18; // Number of doors * 18sqft
    }
    
    public double windowsdoorsSqft(){
        return windowsSqft() + doorsSqft();
    }
    
    public double totalSqft(){
        return roomSqft() - windowsdoorsSqft();
    }
    
    public double paintNeeded(){
        return totalSqft()/120;
    }
    

}
