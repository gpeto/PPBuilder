package builder;

public abstract class Fandangos implements Item{

	@Override
	   public Embalagem embalagem() {
	      return new Embrulho();
	   }
	   @Override
	   public abstract double preço();
}
