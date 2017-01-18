//This is new feature test merged from branch

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewFeature1 {

	public static void main(String[] args) {
		// Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
// 		System.out.println("This is new feature test in a new branch");
    System.out.println("This is new feature test merged from branch");
// 		System.out.println("This is new feature test in master");
		System.out.println("The time is  " + df.format(new Date()));
	}

}
