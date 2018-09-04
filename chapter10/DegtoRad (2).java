public class Trig
{  
  public static void main ( String[] args )  
  {    
    double radianssin = 30;
    rad = degrees * Math.PI/180;
    double sinx = Math.sin(radianssin);
    double radianscos = 30;
    double cosx = Math.cos(radianscos);
    double sum = ((sinx * sinx) + (cosx * cosx));
    
    System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
    
  }
}