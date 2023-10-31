import java.util.Scanner;
class Vidu1 {
	private int a;
	private int b;
	
	public Vidu1(){
	}
	
	Scanner ip = new Scanner(System.in);
	public void Input(){
		System.out.print("\nNhap vao a: ");
		this.a = ip.nextInt();
		System.out.print("\nNhap vao b: ");
		this.b = ip.nextInt();
	}
	
	public int TinhTong(){
		int tong=0;
	return tong = this.a + this.b;
		
	}
	
	public int TinhTich(){
		int tich = 0;
	return	tich = this.a*this.b;
	}

	
	public int getA() {
		return (this.a); 
	}


	public int getB() {
		return (this.b); 
	}
	
	
}
