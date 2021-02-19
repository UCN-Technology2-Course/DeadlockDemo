
public class Worker extends Thread {

	private Resource res1;
	private Resource res2;
	private String name;

	public Worker(String name, Resource res1, Resource res2) {
		super();
		this.res1 = res1;
		this.res2 = res2;
		this.name = name;
	}

	@Override
	public void run() {

		synchronized (res1) {

			System.out.println(name + ": locked resource: " + res1.name);

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			synchronized (res2) {

				System.out.println(name + ": locked resource: " + res2.name);
			}
		}
	}
}
