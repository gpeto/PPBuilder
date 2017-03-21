package builder;

public abstract class Suco implements Item{
	@Override
	public Embalagem embalagem() {
       return new Garrafa();
	}
	@Override
	public abstract double preço();
}
