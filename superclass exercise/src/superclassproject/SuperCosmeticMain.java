package superclassproject;
/*
 * This is the Main class of this project. 
 */
public class SuperCosmeticMain {
	public static void main(String[] arges){
		
		SuperCosmetics mytest[] = new SuperCosmetics[3];
		for (int i = 0; i<3; i++){
			mytest [i]= new SuperCosmetics();
		}
		
			
		for (int i=0; i<3; i++)	{
			if(i<1){
		String n = mytest[i].getname();
		String p = mytest[i].getproduct();
		String b = mytest[i].getbrand();
		String pr = mytest[i].getprice();
		
		
		System.out.println("Print " + (i+1));
		System.out.println(n);
		System.out.println(b);
		System.out.println(p);
		System.out.println(pr);
		System.out.println();
	
		try{Thread.sleep(1000);}
		catch(Exception e){};
		
			}else{
		
		String n = mytest[i].getname();
		String b2 = mytest[i].setbrand();
		String n2 = mytest[i].setproduct();
		String p2 = mytest[i].setprice();
		
		System.out.println();
		System.out.println("Print " + (i+1));
		System.out.println(n);
		System.out.println(b2);
		System.out.println(n2);
		System.out.println(p2);
		
		try{Thread.sleep(1000);}
		catch(Exception e){};
		}
		}
	}

}
