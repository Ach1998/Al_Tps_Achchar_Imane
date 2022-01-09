package comp;

import java.util.ArrayList;
import java.util.List;

public class Category extends Component {
	public Category(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	private List<Component>components = new ArrayList<Component>();
	
	@Override
	public void operation() {
		String tab="";
		for (int i=0;i<level;i++)
			tab+="    ";
		System.out.println(tab+"Category"+ name);
		for(Component c :components)
			c.operation();
		
	}
	public void add(Component c) {
		c.level=this.level+1;
		components.add(c);
	}
	public void deleteCategory(Component c) {
		components.remove(c);
	}
	public List<Component> getChilds(){
		return components;
	}
	

}
