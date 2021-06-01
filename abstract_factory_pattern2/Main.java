package abstract_factory_pattern2;

public class Main {
	public static void main(String[] args) {
		GuiFactory fac = new LinuxGuiFactory();
		Button button = fac.createButton();
		TextArea area = fac.createTextArea();

		button.click();
		System.out.println(area.getText());

		GuiFactory facMac = new MacGuiFactory();
		Button buttonMac = facMac.createButton();
		TextArea areaMac = facMac.createTextArea();

		buttonMac.click();
		System.out.println(areaMac.getText());
	}
}
