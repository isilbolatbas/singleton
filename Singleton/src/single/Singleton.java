package single;

public class Singleton {

	private static Singleton instance; // private static Singleton tipinde instance yaratilir.

	private Singleton() {
	} // private constructor olusturulur.

	public static Singleton getInstance() {

		if (instance == null) {

			instance = new Singleton();
			System.out.println("create new object");

		}

		else

			System.out.println("object previously created");

		return instance;
	}
	

}
