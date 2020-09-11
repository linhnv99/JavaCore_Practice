package calendar_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // thời gian hiện tại
		int date = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH);// chú ý: 0-11
		int year = cal.get(Calendar.YEAR);
		System.out.println(date);
		System.out.println(month + 1);
		System.out.println(year);
		
		System.out.println("===> "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));//số ngày tối đa trong tháng hiện tại
		System.out.println("===> "+cal.getMaximum(Calendar.DAY_OF_MONTH));// số ngày tối đa trong tháng của năm
		// 1 tháng tối đa có 31 ngày.
		
		// add = chỉnh lịch 1 khoảng thời gian so với thời điếm
		// hiện tại của lịch
		cal.add(Calendar.DATE, 1);// thêm 1 ngày
		System.out.println(cal.get(Calendar.DATE));

		// roll : xoay 1 trường nào đó của lịch
		// roll: không làm thay đổi các trường khác
		cal.roll(Calendar.MONTH, -1);
		System.out.println(cal.get(Calendar.MONTH) + 1);
		
		cal = Calendar.getInstance();// lấy thời gian hiện tại
		long mil = cal.getTimeInMillis();// lấy ra epoch time
		
		Date d = new Date(mil);
		System.out.println(d);
		
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss aa");
		String da = df.format(d);
		System.out.println(da);
		
		da = "11/05/1999 05:00:00 AM";
		try {
			df.parse(da);// string -> date
			System.out.println(da);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
