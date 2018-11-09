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
  public Box oldBox(Box oldBox) {
    return new Box(width, height, length);}
    public double length() {
    this.length = length;
    }

    public double height() {
    this.height = height;
    }

    public double width() {
    this.width = width;
    }
    Box(Box oldBox) {
		return new Box(width, height, length);
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

    public double volume() {
		return width * length * height;
	}
	public double area() {
		return 2 * (faceArea() + topArea() + sideArea());
	}
	private double faceArea() {
		return width * height;
	} 
	private double topArea() {
		return width * length();
	}
	private double sideArea() {
		return length * height;
    }
    
    public Box biggerBox(Box oldBox) {
		return new Box(1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.width);
	}

	public Box smallerBox(Box oldBox) {
		return new Box(0.75 * oldBox.width(), 0.75 * oldBox.height(), 0.75 * oldBox.width);

    public double area(){
        double area = this.width * this.length;
        return area;

    }

    
}
