import javafx.scene.shape.Box;

public class ImmutableBox{
        double width;
        double height;
        double length;

  // Constructors
    public ImmutableBox (double width, double height, double length){
    this.width = width;
    this.height = height;
    this.length = length;

  }
    public Box(ImmutableBox oldbox){
    this.length = oldbox.length();
    this.height = oldbox.height();
    this.width = oldbox.width();
    }
  
  //Methods
    public double faceArea(){
        double faceArea = this.length * this.height;
        return faceArea;
    }
    public double topArea(){
        double topArea = this.width * this.height;
        return topArea;
    }
    public double sideArea(){
        double sideArea = this.length * this.width;
        return sideArea;
    }

    public double volume(){
        double volume = this.width * this.length * this.height;
        return volume;

    }
    public double area(){
        double area = this.width * this.length;
        return area;

    }

    
}
