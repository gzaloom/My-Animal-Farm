import java.awt.Color;

public class Kangaroo extends Turtle
{ 
  public Kangaroo(World wref)
  {
    super(wref);
    Color bodyColor = new Color(135, 8, 8);
    this.setBodyColor(bodyColor);
    Color shellColor = new Color(153, 255, 255);
    this. forward(50);
    this. turn(90);
    this. forward(50);
    this. turn(90);
    this. forward(50);
    this. turn(90);
    this. forward(50);
    this. turn(90);
    this. forward(50);
  }
  public Kangaroo(int x, int y, World wref)
  {
    super(x, y, wref);
    Color bodyColor = new Color(135, 8, 8);
    this.setBodyColor(bodyColor);
    Color shellColor = new Color(153, 255, 255);
    this. forward(50);
    this. turn(90);
    this. forward(50);
    this. turn(90);
    this. forward(50);
    this. turn(90);
    this. forward(50);
    this. turn(90);
    this. forward(50);
  }
}