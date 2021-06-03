package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

	public Folder(String name) {
		super(name);
	}

	List<Component> children = new ArrayList<>();

	public boolean addComponent(Component component) {
		return children.add(component);
	}

	public boolean removeComponent(Component component) {
		return children.remove(component);
	}
}
