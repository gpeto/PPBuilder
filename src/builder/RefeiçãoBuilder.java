package builder;

public class RefeiçãoBuilder {

	public Refeição prepareVegRefeição (){
	      Refeição refeição = new Refeição();
	      refeição.addItem(new Chocolate());
	      refeição.addItem(new Laranja());
	      refeição.addItem(new Queijo());
	      return refeição;
	   }   

	   public Refeição prepareNonVegRefeição (){
	      Refeição refeição = new Refeição();
	      refeição.addItem(new Morango());
	      refeição.addItem(new Goiaba());
	      refeição.addItem(new Churrasco());
	      return refeição;
	   }

}
