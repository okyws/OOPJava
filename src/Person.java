
public class Person {
	String name;
	String address;
	final String country = "Indonesia";

	// method with value
	void sayHello(String paramName) {
		System.out.println("Hello " + paramName + ", My name is " + name + ".");
	}

	// method return value
	String sayAddress() {
		return "I, come from " + address + ".";
	}
}
