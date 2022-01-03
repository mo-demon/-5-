package 第7次作业;
import java.util.GregorianCalendar;
public class Test3 {

	public static void main(String[] args) {
		
		GregorianCalendar g=new GregorianCalendar();
		
		
		System.out.print(g.get(GregorianCalendar.YEAR)+"年 ");
		System.out.print(g.get(GregorianCalendar.MONTH)+1+"月 ");
		System.out.print(g.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		System.out.println();
		
		g.setTimeInMillis(1234567898765L);
		
		System.out.print(g.get(GregorianCalendar.YEAR)+"年 ");
		System.out.print(g.get(GregorianCalendar.MONTH)+1+"月 ");
		System.out.print(g.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		
		
	}

}