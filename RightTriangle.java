import java.lang.Math;
import java.util.Scanner;
class RightTriangle extends DauVao{
	public RightTriangle(int length, int width){
		super(length ,width);
	}
	
	public void AreaTriangle(){
		int Area;
		Area = (getLength()*getWidth())/2;
		System.out.print("\nArea of the Triangle: "+Area);
	}
	public void CircumferenceTriangle(){
		int Circumference;
		double Hypotenuse;
		double Length1 = (double) getLength();
		double Width1 = (double) getWidth();
		Hypotenuse = Math.sqrt(Length1*Length1 + Width1*Width1);
		int Hypotenuse1 = (int) Hypotenuse;
		Circumference = (getLength()+getWidth()+Hypotenuse1);
		System.out.print("\nCircumference of the RightTriangle: "+Circumference);
	}
	
	public void PaintTriangle(){
		System.out.print("\nFigure: \n");
		for(int i=0 ; i<getLength() ; i++){
			for(int j=0 ; j<getWidth() ; j++){
				if(i>=j){
					System.out.print(" * ");
				}	
			}
		System.out.print("\n");	
		}
	}
	
	public void PaintHollowTriangle(){
		System.out.print("\nFigure: \n");
		for(int i=0 ; i<getLength() ; i++){
			for(int j=0 ; j<getWidth() ; j++){
				if(i>=j){
					if(i==0 || j==0 || i==getLength()-1 || j==i){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}	
		    }
		    	System.out.print("\n");
		}
		
		}
}

