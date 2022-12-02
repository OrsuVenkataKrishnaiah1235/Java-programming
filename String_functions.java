class String_functions
{
public static void main(String[] args)
{
	String hi="Krishna ";
	String my="Hare Krishna ";
	System.out.println(hi.length());
	System.out.println(hi.toLowerCase());
	System.out.println(hi.toUpperCase());
	System.out.println(hi.indexOf("a"));
	System.out.println(my+hi);
	System.out.println(hi.concat(my));
	
	System.out.println((int)Math.sqrt(16));
	System.out.println((int)Math.abs(-16.2));
	System.out.println((int)Math.pow(2,3));
	System.out.println((int)Math.random()*101);
}
}
