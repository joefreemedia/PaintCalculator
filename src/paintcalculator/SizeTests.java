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
public class SizeTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Windows windows = new Windows(2);
        //Doors doors = new Doors(1);
        RoomSize roomsize = new RoomSize(10, 15, 2, 1);
        System.out.println("Window Square Feet: " + roomsize.windowsSqft() + "Sqft");
        System.out.println("Door Square Feet: " + roomsize.doorsSqft() + "Sqft");
        System.out.println("Room Square Feet: " + roomsize.roomSqft() + "Sqft");
        System.out.println("Total Windows and Doors: " + roomsize.windowsdoorsSqft() + "Sqft");
        System.out.println("Total Paint Needed: " + roomsize.paintNeeded() + " Cans");
    }

    
}
