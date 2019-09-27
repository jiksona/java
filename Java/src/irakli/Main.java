package irakli;

public class Main {

    public static void main(String[] args) {
	TestClass test1= new TestClass();
	test1.name = "Sandro";
	test1.lastName = "Chkadua";
	test1.setAge(20);
	test1.printNameAndLastname();

	TestClass test2= new TestClass();
	test2.name = "Irakli";
	test2.lastName = "Jikia";
	test2.setAge(20);
	test2.printNameAndLastname();
	test2.returnAfterFuurYear();
	System.out.println("sandro iqneba "+test1.returnAfterFuurYear()+"s 4 wlis shemdeg");

    }
}
