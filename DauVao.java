import java.util.Scanner;
class DauVao {
	private int length, width;
	public DauVao(int length, int width){
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return (this.length); 
	}

	public int getWidth() {
		return (this.width); 
	}

	public boolean CheckInput(){
		if (this.length >= this.width || this.length >= 0 || this.width >= 0) {
        	return true;
    	}
   		 return false;
	}
}
