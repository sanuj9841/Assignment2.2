package arthmetic;
//((((10/2)+2)-2)*2)
public class Assignment {
	
	public int div (int a , int b) {
		int c;
		c=a/b;
		System.out.println("division result "+c);
		return c;
	}
	
	public int sum (int a, int v) {
		int c;
		c=a+v;
		System.out.println("sum result "+c);
		return c;
		
	}
	
	public int sub (int a , int c) {
		int v;
		v=a-c;
		System.out.println("substraction result "+v);
		return v;
	}
	
	public int mul (int a, int b) {
		int c;
		c=a*b;
		System.out.println("final after multipule result "+c);
		return c;
	}
	
	public static void main(String[]args) {
		
		Assignment sec = new Assignment();
		
		int divi=sec.div(10, 2);
		int sum= sec.sum(divi, 2);
		int subs =sec.sub(sum, 2);
		int multi=sec.mul(subs, 2);()
	}
	
	
	

}