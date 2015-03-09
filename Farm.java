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
    Kangaroo Fredrick=new Kangaroo(400, 240, wref);
    //you typed ref instead of wref//
  }
}