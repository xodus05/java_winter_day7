package test.inheritance1;

public class RunStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "���¿�";
		s1.age = 18;
		s1.addr = "����� ������";
		System.out.println("���� : " + s1.name);
		System.out.println("���� : " + s1.age);
		System.out.println("�ּ� : " + s1.addr);
		
		System.out.println(s1.name + "��");
		s1.eat();
		s1.sleep();
		s1.study();
		

	}

}
