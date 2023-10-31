
class Square extends DauVao{
	public Square(int length, int width) {
        super(length, width); // Only pass length and width to the parent constructor
    }
	
	public void AreaSquare(){
		int Area;
		Area = getLength()*getWidth();
		System.out.print("\nArea of the Square: "+Area);
	}
	
	public void CircumferenceSquare(){
		int Circumference;
		Circumference = getLength()*4;
		System.out.print("\nCircumference of the Square: "+Circumference);
	}
	
	public void PaintSquare(){
		System.out.print("\nFigure: \n");
		for(int i=0 ; i<getWidth(); i++){
			for(int j=0 ; j<getLength() ; j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
	
	public void PaintHollowSquare(){
		System.out.print("\nFigure Hollow: \n");
		for(int i=0 ; i<getWidth(); i++){
			for(int j=0 ; j<getLength() ; j++){
				if(i == 0 || j == 0 || i == getWidth() - 1 || j == getLength() - 1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");//3 khoang trang 
				}
						
			}
			System.out.print("\n");
		}
	}
}
