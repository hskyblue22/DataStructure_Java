package section01;

public class Code01 {

	public static void main(String[] args) {
		
		Person1 first = new Person1();    // object
		
		first.name = "John";
		first.number = "01034567890";
		
		System.out.println("Name: "+ first.name+ ", Number: "+ first.number);

		Person1 [] members = new Person1 [100];
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "Ping";
		members[1].number = "01056223456";
		
		System.out.println("Name: "+ members[1].name+ ", Number: "+ members[1].number);
	}

}
