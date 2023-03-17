package functional;

import java.util.function.Consumer;

public class TestFunctionalIF {

	public static void main(String[] args) {

		MyClassForFI m = new MyClassForFI();
		m.show();

		// or
		MyFunInterface1 mf1 = new MyFunInterface1() {
			@Override
			public void show() {
				System.out.println("---show in annonymous class");

			}
		};
		mf1.show();
		// or in java 8 for functional i/f lambda exporessions introduce
		// annonymous methods :methods with no name

		MyFunInterface1 mf2 = () -> {
			System.out.println("---show in annonymous function");
		};
		mf2.show();

		// void add(int i,int j);

		MyFunInterface2 mf3 = (a, b) -> {
			System.out.println("Add=" + (a + b));
		};
		mf3.add(56, 45);

		mf3.add(156, 45);

		Consumer<Integer> intObj = (p) -> System.out.println(p);
		intObj.accept(709);

	}

}
