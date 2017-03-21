package builder;

public abstract class Sorvete implements Item{

	@Override
	   public Embalagem embalagem() {
	      return new Copo();
	   }
	   @Override
	   public abstract double preço();
	
}
