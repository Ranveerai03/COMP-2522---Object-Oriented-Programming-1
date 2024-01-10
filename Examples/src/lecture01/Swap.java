package lecture01;

public class Swap{
	public static void swap(Object a, Object b){
		Object temp = a;
		a = b;
		b = temp;
	}
	public static void main(String[] args){
		String x = "hi";
		String y = "bye";
		swap(x,y);
		System.out.println(x);
	}
}