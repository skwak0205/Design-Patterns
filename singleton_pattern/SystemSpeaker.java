package singleton_pattern;

public class SystemSpeaker {

	// 인스턴스 생성은 단 한번만!!!!

	private static SystemSpeaker instance;
	private int volume;

	private SystemSpeaker() {
		volume = 5;
	}

	public static SystemSpeaker getInstance() {
		if (instance == null) {
			instance = new SystemSpeaker();
		}
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
