
public class Program {

	public static void main(String[] args) {

		Resource res1 = new Resource("Resource_1");
		Resource res2 = new Resource("Resource_2");

		Worker w1 = new Worker("Worker_1", res1, res2);
		Worker w2 = new Worker("Worker_2", res2, res1);
		
		w1.start();
		w2.start();
	}

}
