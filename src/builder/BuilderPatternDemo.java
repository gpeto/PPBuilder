package builder; 

public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		 RefeiçãoBuilder refeiçãoBuilder = new RefeiçãoBuilder();

	      Refeição vegRefeição = refeiçãoBuilder.prepareVegRefeição();
	      System.out.println("Refeição 01: \n");
	      vegRefeição.showItems();
	      System.out.println("Total Custo: " + vegRefeição.getCust());
	      System.out.println("------\\--------");

	      Refeição nonVegRefeição =refeiçãoBuilder.prepareNonVegRefeição();
	      System.out.println("\n\nRefeição 02: \n");
	      nonVegRefeição.showItems();
	      System.out.println("Total Custo: " + nonVegRefeição.getCust());
	      System.out.println("------\\--------");
	   }
	}

