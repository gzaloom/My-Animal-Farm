import java.awt.Color;
public class Bear extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Bear(World wref)
  { 
    super(wref);
    Color shellColor = new Color(200, 50, 10); //requires import line at top to work (new color defined using RGB values)
    this.setShellColor(shellColor);
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Bear(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}