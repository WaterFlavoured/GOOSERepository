package basicSyntax;

public class JavaEnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreshJuice juiceS = new FreshJuice();
		FreshJuice juiceM = new FreshJuice();
		FreshJuice juiceL = new FreshJuice();
		
		juiceS.size = FreshJuice.FreshJuiceSize.SMALL;
		juiceM.size = FreshJuice.FreshJuiceSize.MEDIUM;
		juiceL.size = FreshJuice.FreshJuiceSize.LARGE;
		
		System.out.println("Size: " + juiceM.size);
	}

}

class FreshJuice {
	enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}
