import java.util.Scanner;
class MainVidu1 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Vidu1 t = new Vidu1();
		t.Input();
		System.out.print("\nGia tri cua A: "+t.getA());
		System.out.print("\nGia tri cua B: "+t.getB());
		System.out.print("\nTong a va b la: "+t.TinhTong());
		System.out.print("\nTich a va b la: "+t.TinhTich());
		
		System.out.print("\nHam ke thua tu Vi du 1: ");
		KethuaVidu1 k = new KethuaVidu1(6);
		k.Input();
		System.out.print("\nTong cua a,b,c: "+k.TinhTong());
		System.out.print("\nTich cua a,b,c: "+k.TinhTich());
	}	
}
