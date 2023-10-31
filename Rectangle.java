
class Rectangle extends Square{
	public Rectangle(int Length, int Width){
		super(Length, Width);
	}
	
	public void CircumferenceRectangle(){
		int Circumference = (getLength()+getWidth())*2;
		System.out.print("\nCircumference of the Rectangle: "+Circumference);
	}
}
