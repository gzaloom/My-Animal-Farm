public class Farm
{
  public static void main(String[] a)
  {
    World wref=new World();
    Bear paddington=new Bear(wref);
    paddington.forward(100);
    Lion simba=new Lion(wref);
    simba.forward(100);
    simba.turnRight();
    simba.forward(100);
    simba.turnRight();
    simba.forward(150);


  }
}