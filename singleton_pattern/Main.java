package singleton_pattern;

public class Main {
	public static void main(String[] args) {

		// 여기서 객체 생성 못함 - private으로 되어 있기 때문
		// SystemSpeaker speaker = new SystemSpeaker();

		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();

		System.out.println(speaker1);
		System.out.println(speaker2);

		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());

		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());

		speaker2.setVolume(22);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());

	}
}
