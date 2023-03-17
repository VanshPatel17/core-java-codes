package contract;

public interface IPrintable {

	void print();//bydefault all methods are public and abstract
	//abstract method
	
	default void accpet() {
		System.out.println("Implemented in i/f ");
	};
}
