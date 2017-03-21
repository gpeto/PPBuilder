package builder; 

public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		 Refei��oBuilder refei��oBuilder = new Refei��oBuilder();

	      Refei��o vegRefei��o = refei��oBuilder.prepareVegRefei��o();
	      System.out.println("Refei��o 01: \n");
	      vegRefei��o.showItems();
	      System.out.println("Total Custo: " + vegRefei��o.getCust());
	      System.out.println("------\\--------");

	      Refei��o nonVegRefei��o =refei��oBuilder.prepareNonVegRefei��o();
	      System.out.println("\n\nRefei��o 02: \n");
	      nonVegRefei��o.showItems();
	      System.out.println("Total Custo: " + nonVegRefei��o.getCust());
	      System.out.println("------\\--------");
	   }
	}

