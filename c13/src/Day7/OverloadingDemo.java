package Day7;

public class OverloadingDemo {

	public static void main(String[] args) {
		Overloading oc = new Overloading();
		
		System.out.println(oc.add(25, 16));
		System.out.println(oc.add(0.25f, 0.12f));
		System.out.println(oc.add(10.01, 25.01));
		System.out.println(oc.sub(10,5));
		System.out.println(oc.sub(0.5f, 0.4f));
		System.out.println(oc.sub(10.55, 9.44));
		System.out.println(oc.mul(10,5));
		System.out.println(oc.mul(0.5f, 0.5f));
		System.out.println(oc.mul(10.5, 010.5));
		System.out.println(oc.div(25, 5));
		System.out.println(oc.div(0.4f, 0.2f));
		System.out.println(oc.div(25.25, 5.5));
		System.out.println(oc.mod(10, 5));
		System.out.println(oc.mod(0.4, 0.2));
		System.out.println(oc.mod(12.06, 0.2));
	}

}
