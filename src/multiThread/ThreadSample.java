package multiThread;

public class ThreadSample extends Thread{
	@Override
	public void run() {
		System.out.println("Thread running ....");
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + "--> " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
