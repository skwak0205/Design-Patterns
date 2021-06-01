package abstract_factory_pattern2;

public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("리눅수 버튼");
	}

}
