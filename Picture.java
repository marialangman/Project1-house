/**
 * Modified by Maria Langman, Sept 21, 2015
 * Made a parachuter using the four classes Person, Square, Triangle, Cirlce
 * and added a door to the house so he can get in when he lands.
 * 
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square door;
    private Square doorNeg;
    private Person person;
    private Circle chute;
    private Circle chuteNeg;
    private Triangle chuteLeft;
    private Triangle chuteLNeg;
    private Triangle chuteRight;
    private Triangle chuteRNeg;
   
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(30);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(28);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.changeSize(50);
        door.moveHorizontal(-80);
        door.moveVertical(90);
        door.makeVisible();
        
        doorNeg = new Square();
        doorNeg.moveHorizontal(-120);
        doorNeg.moveVertical(80);
        doorNeg.makeVisible();
    
        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(60);
        sun.makeVisible();
        
        person = new Person();
        person.makeVisible();
        
        chuteLeft = new Triangle();
        chuteLeft.moveHorizontal(165);
        chuteLeft.changeColor("black");
        chuteLeft.moveVertical(40);
        chuteLeft.makeVisible();
        
        chuteRight = new Triangle();
        chuteRight.moveHorizontal(240);
        chuteRight.changeColor("black");
        chuteRight.moveVertical(40);
        chuteRight.makeVisible();
        
        chute = new Circle();
        chute.changeSize(90);
        chute.changeColor("red");
        chute.moveHorizontal(130);
        chute.moveVertical(30);
        chute.makeVisible();
        
        chuteNeg = new Circle();
        chuteNeg.changeSize(70);
        chuteNeg.moveHorizontal(138);
        chuteNeg.moveVertical(55);
        chuteNeg.changeColor("white");   
        chuteNeg.makeVisible();
        
        chuteLNeg = new Triangle();
        chuteLNeg.moveHorizontal(155);
        chuteLNeg.moveVertical(40);
        chuteLNeg.changeColor("white");
        chuteLNeg.makeVisible();
       
        chuteRNeg = new Triangle();
        chuteRNeg.moveHorizontal(250);
        chuteRNeg.changeColor("white");
        chuteRNeg.moveVertical(40);
        chuteRNeg.makeVisible();
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            chute.changeColor("black");
            chuteNeg.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            chute.changeColor("red");
            chuteNeg.changeColor("white");
        }
    }
}
