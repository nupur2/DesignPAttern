package creational_type;

/*
 * Ensure that only one instance of a class is created.
 * Provide a global point of access to the object.
 * Where to use - Logger Classes,Configuration Classes,Accesing resources in shared mode,Factories implemented as Singletons.
 */

/*
 * Multithreading - A special care should be taken when singleton has to be used in a multithreading application.
 *Serialization - When Singletons are implementing Serializable interface they have to implement readResolve method in order to avoid having 2 different objects.
 *Classloaders - If the Singleton class is loaded by 2 different class loaders we'll have 2 different classes, one for each class loader.
 *Global Access Point represented by the class name - The singleton instance is obtained using the class name. At the first view this is 
 *an easy way to access it, 
 *but it is not very flexible. If we need to replace the Sigleton class, all the references in the code should be changed accordinglly.
 */
public class SingletonImpl {
	public static void main(String[] args) {
		System.out.println(Singlton.getInstance());

	}

}

class Singlton {

	private static Singlton singltonInstance;

	private Singlton() {

	}

	public static Singlton getInstance() {
		if (singltonInstance == null) {
			synchronized (Singlton.class) {
				if (singltonInstance == null) {
					singltonInstance = new Singlton();
				}
			}
		}
		return singltonInstance;

	}
}

class SingltonEarlyInit {
	private static SingltonEarlyInit singltonEarlyInit = new SingltonEarlyInit();

	private SingltonEarlyInit() {

	}

	public static SingltonEarlyInit getInstance() {
		return singltonEarlyInit;
	}

}
