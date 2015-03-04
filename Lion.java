import java.awt.Color;

public class Lion extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Lion(World wref)
  {
    super(wref);
    Color sc = new Color(201, 185, 45);
    this.setShellColor(sc);
    Color bc = new Color(246, 225, 38);
    this.setBodyColor(bc);
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Lion(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}