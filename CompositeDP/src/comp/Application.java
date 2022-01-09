package comp;

public class Application {

	public static void main(String[] args) {
		Category category = new Category("1");
		Category category01= new Category("01");
		Category category02= new Category("02");
		Category category3= new Category("3");
		category.add(new Product ("1"));

		category.add(category01);
		category.add(category02);
		category02.add(category3);
		category3.add (new Product ("03"));
		
		category.operation();
		

		

	}

}
