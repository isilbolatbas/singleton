package single;

public class Test {

	public static void main(String[] args) {

	    int x = 0;

		do {
			Singleton singleton = Singleton.getInstance();
			Singleton singleton2 = Singleton.getInstance();
			x++;

		} while (x < 5);

	}

}
