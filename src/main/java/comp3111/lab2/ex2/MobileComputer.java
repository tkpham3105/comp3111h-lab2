package comp3111.lab2.ex2;

public class MobileComputer extends Computer implements Chargeable {
	private int battery;
	public MobileComputer() {
		secret = "MobileComputer secret";
		battery = 5;
	}
	@Override
	public void work() {
		if (battery>0) {
			System.out.println("It is working on my lap.");
			battery--;
		} else
			System.out.println("Running out of battery");
	}
	@Override
	public void charge() {
		if(battery<10)
			battery++;
		System.out.println("Charge this MobildComputer");
	}
}
/* I added "implements Chargeable" into Line 3 to modify it to "public class MobileComputer extends Computer implements Chargeable {"
 * When the MobileComputer class implements Chargeable, MobileComputer object possesses chargeable capacity
 * It allows MobileComputer object m to be argument for c.charge(m) in the Library.java file. 
 * Therefore, it worked.
 */