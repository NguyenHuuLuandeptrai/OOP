import java.util.Scanner;
class MainSquare {
	public static void main (String[] args) {
		int length, width;
		Scanner ip = new Scanner(System.in);
    	//Giao dien nguoi dung
    	outerLoop:
		while(true){
		  System.out.print("\n+-----------------------------------------------+");
		  System.out.print("\n|        TINH DIEN TICH, CHU VI, VE HINH        +");
		  System.out.print("\n+-----------------------------------------------+");
		  System.out.print("\n|				   1. HINH VUONG			    |");
		  System.out.print("\n+-----------------------------------------------+");
		  System.out.print("\n|				  2. TAM GIAC VUONG CAN			|");
		  System.out.print("\n+-----------------------------------------------+");
		  System.out.print("\n|				  3. HINH CHU NHAT		        |");
		  System.out.print("\n+-----------------------------------------------+");
		  System.out.print("\n|				      4. EXIT               	|");
		  System.out.print("\n+-----------------------------------------------+");
		  System.out.print("\n|			Design by @NguyenHuuLuanDA22TTB     |");
		  System.out.print("\n+-----------------------------------------------+");
		  System.out.print("\nNHAP CHUC NANG CAN SU DUNG: ");
		  int key = ip.nextInt();
		  
		  switch(key){
		  	case 1:
		  		do{
						System.out.print("\nEnter length = width!");
						System.out.print("\nEnter length: ");
						length = ip.nextInt();
						System.out.print("Enter width: ");
						width = ip.nextInt();	
					}while(length != width);
					Square t = new Square(length,width);
					System.out.print("\nInformation  of Square: ");
					System.out.print("\nLength: "+t.getLength());
					System.out.print("\nWidth: "+t.getWidth());
		interLoop:
		  		while(true){
		  			System.out.print("\n+-----------------------------------------------+");
		  		    System.out.print("\n|				  1.Dien tich                   |");
		  			System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  2.Tinh chu vi                 |");
		  	    	System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  3.Ve hinh(dac)                |");
		  	    	System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  4.Ve hinh(rong)               |");
		  	    	System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  5.Tro lai menu chinh          |");
		  	    	System.out.print("\n+-----------------------------------------------+");
		  	        
		  	        
		  	    	System.out.print("\nNhap chuc nang can su dung: ");
		  	        int k = ip.nextInt();	
		  	        switch(k){
		  	        	case 1:
		  	        		if(t.CheckInput() == true){
								t.AreaSquare();
							}
							else{
								System.out.print("\nThe information you entered incorrect!");
							}
						    System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();
		  	        		break ;
		  	        	case 2:
		  	        		if(t.CheckInput() == true){
								t.CircumferenceSquare();
							}
							else{
								System.out.print("\nThe information you entered incorrect!");
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();
		  	        		break;
		  	        	case 3:
		  	        		if(t.CheckInput() == true){
								t.PaintSquare();
							}
							else{
								System.out.print("\nThe information you entered incorrect!");
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();
		  	        		break;
		  	        	case 4:
		  	        		if(t.CheckInput() == true){
								t.PaintHollowSquare();
							}
							else{
								System.out.print("\nThe information you entered incorrect!");
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();
		  	        		break;
		  	        	case 5:
		  	        		continue outerLoop; // Tro lai vong lap dau tien cua while ngoai
		  	        	default:
		  	        		System.out.print("\nKhong co chuc nang nay!");
		  	        }
		  		}
		  		//System.exit(1);
		  		
		  	case 2:
		  		System.out.print("\nNhap canh goc vuong thu 1: ");
				length = ip.nextInt();
				System.out.print("Nhap canh goc vuong thu 2: ");
				width = ip.nextInt();
				RightTriangle m = new RightTriangle(length,width);
				System.out.print("\nInformation of RightTriangle: ");
				System.out.print("\nCanh goc vuong thu nhat: "+m.getLength());
				System.out.print("\nCanh goc vuong thu hai: "+m.getWidth());
	interLoop:	  while(true){
		  			System.out.print("\n+-----------------------------------------------+");
		  		    System.out.print("\n|				  1.Dien tich                   |");
		  			System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  2.Tinh chu vi                 |");
		  	    	System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  3.Ve hinh(dac)                |");
		  	    	System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  4.Ve hinh(rong)               |");
		  	    	System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  5.Tro lai menu chinh          |");
		  	    	System.out.print("\n+-----------------------------------------------+"); 
		  	    	System.out.print("\nNhap chuc nang can su dung: ");
		  	        int k = ip.nextInt();	
		  	        switch(k){
		  	        	case 1:
		  	        		if(m.CheckInput() == true){
								m.AreaTriangle();
							}
							else{
								System.out.print("\nThe information you entered incorrect!");
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();
		  	        		break;
		  	        	case 2:
		  	        		if(m.CheckInput() == true){
								m.CircumferenceTriangle();
							}
							else{
								System.out.print("\nThe information you entered incorrect!");
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();
		  	        		break;
		  	        	case 3:
		  	        		if(m.CheckInput() == true){
								if(m.getLength() == m.getWidth()){
									m.PaintTriangle();	
					
								}
								else{
									System.out.print("\nChuong trinh chi ve duoc tam giac vuong can!");
								}
			
							}
							else{
								System.out.print("\nThe information you entered incorrect!");
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();
		  	        		break;
		  	        	case 4:
		  	        		if(m.CheckInput() == true){
								if(m.getLength() == m.getWidth()){
									m.PaintHollowTriangle();	
					
								}
								else{
									System.out.print("\nChuong trinh chi ve duoc tam giac vuong can!");
								}
			
							}
							else{
								System.out.print("\nThe information you entered incorrect!");
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();
		  	        		break;
		  	        	case 5:
		  	        		continue outerLoop;
		  	        	default:
		  	        		System.out.print("\nKhong co chuc nang nay!");
		  	        }
		  		}
		  		
		  		//System.exit(1);
		  	case 3:
		  		do{
		  	        System.out.print("\nNhap length > width");
		  	        System.out.print("\nEnter length: ");
					length = ip.nextInt();
					System.out.print("Enter width: ");
					width = ip.nextInt();
		  	     }while(length <= width);
		  	     Rectangle k = new Rectangle(length, width);
				System.out.print("\nInformation of the Rectangle: ");
				System.out.print("\nLength: "+k.getLength());
				System.out.print("\nWidth: "+k.getWidth());
		  		while(true){
		  			System.out.print("\n+-----------------------------------------------+");
		  		    System.out.print("\n|				  1.Dien tich                   |");
		  			System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  2.Tinh chu vi                 |");
		  	    	System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  3.Ve hinh(dac)                |");
		  	    	System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  4.Ve hinh(rong)               |");
		  	    	System.out.print("\n+-----------------------------------------------+");
		  	    	System.out.print("\n|				  5.Tro lai menu chinh          |");
		  	    	System.out.print("\n+-----------------------------------------------+");
					
		  	    	System.out.print("\nNhap chuc nang can su dung: ");
		  	        int l = ip.nextInt();	
		  	        switch(l){
		  	        	case 1:
		  	        		if(k.CheckInput() == true){
								k.AreaSquare();
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();	
		  	        		break;
		  	        	case 2:
		  	        		if(k.CheckInput() == true){
								k.CircumferenceRectangle();
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();	
		  	        		break;
		  	        	case 3:
		  	        		if(k.CheckInput() == true){
								k.PaintSquare();
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();	
		  	        		break;
		  	        	case 4:
		  	        		if(k.CheckInput() == true){
								k.PaintHollowSquare();
							}
							System.out.print("\nAn phim bat ki de tiep tuc su dung chuc nang khac!");
						    ip.nextLine();
						    ip.nextLine();	
		  	        		break;
		  	        	case 5:
		  	        		continue outerLoop;
		  	        	default:
		  	        		System.out.print("\nKhong co chuc nang nay!");
		  	        }
		  		}
		  	case 4:
		  		System.exit(1);
		  		break;
		  	default:
		  		System.out.print("\nKHONG CO CHUC NANG NAY!");
		  		break;
		  }
		}
			
		  
	}
}
