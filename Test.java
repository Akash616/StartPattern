import java.util.*;

class Test{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter odd number: ");
		int x = sc.nextInt();
		String isNegativeNo = String.valueOf(x);
		if(x%2==0 || x==0 || isNegativeNo.contains("-"))
			System.out.println("Can not proceed further.");
		else {
			//Now start pattern
			
			//Previous odd number of x (last index)
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int inc=0;
			for(int i=1; i<=x; i++){
				if(i%2 == 0){
					continue;
				} else {
					arr.add(i); 
					inc++;
				}
			}
			System.out.println("------------------------------");
			for(int a: arr){
				System.out.println(a);
			}
			System.out.println("------------------------------");
			
			int totalSpace = (x * 2) + arr.get(arr.size()-2);
			System.out.println("Total Space: "+totalSpace);
			
			//x = 5 -> (1-13)---------------------------------------
			for(int i=1; i<=arr.size(); i++){
				for(int j=i; j<=totalSpace; j++){
					System.out.print(" ");
				}
				for(int j=arr.size(); j>1; j--){
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++){
					System.out.print("e");
				}
				if(i>=2){
					for(int j=2; j<=i; j++){
						System.out.print("e");
					}
				}
				System.out.println();
			}
			
			//------------------------------------------------------------
			//arr size matters
			int space1 = arr.size()-1;
			//System.out.println("space1: "+space1);
			for(int i=1; i<x; i++){
				for(int j=1; j<=totalSpace+space1; j++){
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			
			//------------------------------------------------------------
			for(int i=1; i<=totalSpace-space1; i++){
				System.out.print(" ");
			}
			for(int i=1; i<=x; i++){
				System.out.print("*");
			}
			System.out.println();
			
			//------------------------------------------------------------
			//arr size matters
			for(int i=1; i<=x-2; i++){
				for(int j=1; j<=totalSpace-space1; j++){
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			
			//------------------------------------------------------------
			//new space
			int space2 = (totalSpace-space1) - (x-1);
			for(int i=1; i<=space2; i++){
				System.out.print(" ");
			}
			for(int i=1; i<=x; i++){
				System.out.print("*");
			}
			System.out.println();
			
			
			//------------------------------------------------------------
			int divSpace = x/2;
			if(divSpace > 1){
				for(int k=1; k<divSpace; k++){
					for(int i=1; i<=space2; i++){
						System.out.print(" ");
					}
					System.out.print("*");
					System.out.println();
				}
			}
			for(int i=1; i<arr.size(); i++){
				for(int j=arr.size(); j>i; j--){
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++){
					System.out.print("e");
				}
				for(int p=1; p<x; p++){
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			for(int p=1; p<=arr.size(); p++){
				System.out.print("e");
			}
			for(int p=1; p<=x; p++){
				System.out.print("*");
			}
			System.out.println();
			
			//down part last start pattern
			for(int p=1; p<arr.size(); p++){
				for(int e=1; e<=p; e++){
					System.out.print(" ");
				}
				for(int e=arr.size(); e>p; e--){
					System.out.print("e");
				}
				System.out.println();
			}
		}
	}	
	
}