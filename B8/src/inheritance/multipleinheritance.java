package inheritance;

public class multipleinheritance{
class Animal{
	void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking...");
	}

}
class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping...");
	}
}
class Test{
public static void main(String[] args) {
	BabyDog b=new BabyDog();
	b.bark();
	b.eat();
	b.weep();
}

}
}


