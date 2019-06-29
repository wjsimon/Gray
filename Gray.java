
public class Gray {
	//x ^ (x >> 1)
	public static void main (String[] args)  
	{ 
		/*
	    int n = Integer.MAX_VALUE; 
	    int x = toGray(n); 
	    int y = fromGray(x);
		System.out.println(x);
		System.out.println(y);
		System.out.println(n);
		/**/
	} 
	
	public static int toGray(int n) 
	{ 
		int x = n ^ (n >> 1); 
		return x;
	}
	
	public static int fromGray(int g)
	{
		int x = 0; 	      
        for (int i = g; i != 0 ; i = i >> 1) { x = x ^ i; }
        return x; 
	}
}
