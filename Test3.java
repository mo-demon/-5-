package ��7����ҵ;
import java.util.GregorianCalendar;
public class Test3 {

	public static void main(String[] args) {
		
		GregorianCalendar g=new GregorianCalendar();
		
		
		System.out.print(g.get(GregorianCalendar.YEAR)+"�� ");
		System.out.print(g.get(GregorianCalendar.MONTH)+1+"�� ");
		System.out.print(g.get(GregorianCalendar.DAY_OF_MONTH)+"��");
		System.out.println();
		
		g.setTimeInMillis(1234567898765L);
		
		System.out.print(g.get(GregorianCalendar.YEAR)+"�� ");
		System.out.print(g.get(GregorianCalendar.MONTH)+1+"�� ");
		System.out.print(g.get(GregorianCalendar.DAY_OF_MONTH)+"��");
		
		
	}

}