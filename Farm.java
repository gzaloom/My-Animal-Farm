public class Farm
{
  public static void main(String[] a)
  {
    World wref=new World();
    Bear paddington=new Bear(wref);
    Lion simba=new Lion(wref);
    //you typed ref instead of wref//
  }
}