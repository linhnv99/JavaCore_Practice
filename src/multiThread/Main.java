package multiThread;

public class Main {
	public static void main(String[] args) {
		ThreadSample threadSample = new ThreadSample();
		threadSample.setName("Thread sample");
		threadSample.start();

		RunnableSample runnableSample = new RunnableSample();
		Thread thread = new Thread(runnableSample);
		thread.setName("Runnable sample");
		thread.start();
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=======MAIN THREAD======");
	}
//	Đa luồng: thực thi nhiều hơn 1 luồng, giúp tận dụng time, CPU
//	Có 2 cách tạo:
//	 + extends Thread
//	 + implements interface runnable
	
//	 So sánh giữa 2 cách tạo luồng:
//	khi tạo bằng cách implements runnable thì ta có thể extends 1 class khác 
//	còn tạo bằng extends Thread thì sẽ không thể vì java k hỗ trợ đa kế thừa
	
	
	

//	Mỗi thread có 6 trạng thái
//	+ New: thread được tạo và chưa được khởi chạy
	
//	+ Runnable: đang chạy hoặc đã sẵn sàng chạy nhưng đang chờ được cấp phát tài nguyên

//	+ Waiting: thread sẽ chờ không giới hạn cho tới khi có 1 luồng khác đánh thức nó
	
//	+ Time_waiting: thread sẽ chờ trong khoảng TIME nhất định hoặc có 1 luồng khác đánh thức nó
	
//	+ Blocked: đợi tài nguyên của hệ thống, đợi giành được khóa (monitor lock) để chạy
//	(Hiểu đơn giản là: có nhiều luồng cùng chạy thì khi tới đây tất cả sẽ bị lock và
//	từng luồng sẽ được unlock(chọn để chạy) xử lý tại đây)
	
//	+ Terminated: thread ở trạng thái chấm dứt hoặc đã chết khi phương thức run() đã xong 
//	hoặc xảy ra lỗi ngoại lệ
	
	
	
	
//	AbcXYZ:
//	Ban đầu khởi tạo luồng(new) tiếp đến sẽ sẽ chờ cấp phát tài nguyên(runnable)
//	nếu trong quá trình này xảy ra lỗi sẽ ném ra ngoại lệ và đưa trang thái luồng về terminated
//	ngược lại tiếp tục chạy :D
//		luồng có thể dược chờ trong khoảng thời gian nhất định hoặc vô hạn.(Waiting or Time_waiting)
//		luồng sẽ chạy khi có 1 luồng khác đẩy vào đít :)))
//	Blocked- Khi các luồng chạy tới đây đều sẽ bị lock(dự bị :v) các luồng sẽ
//	giành nhau để unlock(giành khóa monitor)(chạy trước)
}
