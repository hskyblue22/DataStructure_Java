package section01;

public class Code01_2 {

	public static void main(String[] args) {
		
		Person1 first = new Person1();    // object
		
		first.name = "John";
		first.number = "01034567890";
		
		System.out.println("Name: "+ first.name+ ", Number: "+ first.number);

		Person1 second = first;
		second.name = "Tom";
		
		System.out.println("Name: "+ first.name+ ", Number: "+ first.number);
		// second.name 수정해도 first.name 수정됨 (같은 객체 참조하니까)
		
		Person1 [] members = new Person1 [100];
		members[0] = first;
		members[1] = second;
		
		System.out.println("Name: "+ members[0].name+ ", Number: "+ members[0].number);
		System.out.println("Name: "+ members[1].name+ ", Number: "+ members[1].number);	
	
		members[2] = new Person1();
		members[2].name = "S";
		members[2].number = "010";
		
	}

}
