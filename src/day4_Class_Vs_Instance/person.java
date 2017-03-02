package day4_Class_Vs_Instance;

public class person {

	int age;

	public person(int initialAge) {
		// Add some more code to run some checks on initialAge
		if (initialAge > 0) {
			age = initialAge;
		} else {
			System.out.println("Age is not valid, setting age to 0.");
			age = 0;
		}
	}

	public void yearPasses() {
		// Increment this person's age.
		this.age++;
	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the
		// correct statement:
		String ans;
		if (age < 13) {
			ans = "You are young.";
		} else if (13 <= age && age < 18) {
			ans = "You are a teenager.";
		} else {
			ans = "You are old.";
		}
		System.out.println(ans);
	}
}
