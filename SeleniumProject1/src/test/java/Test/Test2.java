package Test;

public class Test2 {

	public static void main(String[] args) {
		
		int a=1;
		int b=a++;
		
		System.out.println(a);  //1
		System.out.println(b);  //2
		
		
		
		int t = 10;
		int r = ++t + t++;
		
       System.out.println(t);
       System.out.println(r);
       
       int i = 10;
       int j = ++i + ++i;
       
       System.out.println(i);
       System.out.println(j);

       Integer M1 = 100;
       Integer M2 = 100;
       
       System.out.println(M1 == M2);
       
       Integer M3 = 20;
       Integer M4 = 30;
       
       System.out.println(M3 == M4);
       
       Integer M5 = 200;
       Integer M6 = 200;
       
       System.out.println(M5 == M6);
       
       Integer I1 = new Integer(200);
       Integer I2 = new Integer(200);
       
       System.out.println(I1 == I2);
       System.out.println(I1.equals(I2));
       
       
       
       
	}
	

}
