package abstract_factory_pattern2;

public class MacGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextarea();
	}

}
