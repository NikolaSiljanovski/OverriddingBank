public class Test {

	public static void main(String[] args) {
	
		SBIbank s = new SBIbank();
		ICICIbank i = new ICICIbank();
		Axisbank a = new Axisbank();
		
		System.out.println("SBi rate of interest is" + s.getRateOfInterest());
		System.out.println("ICICI rate of interest is" + i.getRateOfInterest());
		System.out.println("AXIS rate of interest is" + a.getRateOfInterest());

		

	}

}
