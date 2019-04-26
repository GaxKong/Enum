package com.aca;

public class WinProductTest {

	public static void main(String[] args) {
		
//		WinProduct product1 = WinProduct.DISH;
//		WinProduct product2 = WinProduct.HSI;
//		
//		printEnum(product1);
//		
		

		
		for(WinProduct p : WinProduct.values()){
			System.out.println(p);
		}
	}
	
	public static void printEnum(WinProduct winProduct){
		System.out.println("winProduct: " + winProduct.getItemNumber());
	}

}
