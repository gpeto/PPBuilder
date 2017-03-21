package builder;
import java.util.ArrayList;
import java.util.List;

public class Refeição{

	private List<Item> items = new ArrayList<Item>();	

	   public void addItem(Item item){
	      items.add(item);
	   }

	   public double getCust(){
	      double custo = 0.0;
	      
	      for (Item item : items) {
	         custo += item.preço();
	      }		
	      return custo;
	   }

	   public void showItems(){
		   
		      for (Item item : items) {
		         System.out.println("Item : " + item.nome());
		         System.out.println("Embalagem : " + item.embalagem().pack());
		         System.out.println("Preço : " + item.preço()+"\n");
		      }
		   }	
		}

