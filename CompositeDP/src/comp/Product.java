package comp;

public class Product extends Component {
	public Product(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation() {
		String tab="";
		for (int i=0;i<level;i++)
			tab+="    ";
		System.out.println(tab+"Product"+ name);
	}
	

}
