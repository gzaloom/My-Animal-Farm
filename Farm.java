public class Farm
{
  public static void main(String[] a)
  {
    World wref=new World();
    Bear paddington=new Bear(wref);
    paddington.animate(5);
    paddington.animateTurn(20);
    paddington.animate(4);
    paddington.animateTurn(15);
    Lion simba=new Lion(wref);
    simba.forward(100);
    simba.turnRight();
    simba.forward(100);
    simba.turnRight();
    simba.forward(150);
    Kangaroo kanga = new Kangaroo(100,100,wref);
    

  }
}