package builder;

public class Refei��oBuilder {

	public Refei��o prepareVegRefei��o (){
	      Refei��o refei��o = new Refei��o();
	      refei��o.addItem(new Chocolate());
	      refei��o.addItem(new Laranja());
	      refei��o.addItem(new Queijo());
	      return refei��o;
	   }   

	   public Refei��o prepareNonVegRefei��o (){
	      Refei��o refei��o = new Refei��o();
	      refei��o.addItem(new Morango());
	      refei��o.addItem(new Goiaba());
	      refei��o.addItem(new Churrasco());
	      return refei��o;
	   }

}
