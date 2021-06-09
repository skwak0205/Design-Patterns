package command_pattern;

public class RemoteControlTest {
    public static void main(String[] args) {
        MultipleRemoteControl remote = new MultipleRemoteControl();

        //리시버 및 커맨드 객체 생성
        Light livingLight = new Light("거실");
        LightOnCommand livingLightOn = new LightOnCommand(livingLight);
        LightOffCommand livingLightOff = new LightOffCommand(livingLight);

        Light kitchenLight = new Light("부엌");
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerOnCommand musicPlayerOnCommand = new MusicPlayerOnCommand(musicPlayer);
        MusicPlayerOffCommand musicPlayerOffCommand = new MusicPlayerOffCommand(musicPlayer);

        //인보커 객체의 커맨드 배열에 커맨드 저장
        remote.setCommand(0, livingLightOn, livingLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, musicPlayerOnCommand, musicPlayerOffCommand);

        //인보커 객체 에서 커맨드 객체의 execute() 메소드 호출
        remote.onButtonPressed(0); // 거실 전등 켜짐
        remote.onButtonPressed(1); // 부엌 전등 켜짐
        remote.onButtonPressed(2); // 뮤직 플레이어 켜짐 및 최근 들은 곡 재생

        remote.offButtonPressed(0); // 거실 전등 꺼짐
        remote.offButtonPressed(1); // 부엌 전등 꺼짐
        remote.offButtonPressed(2); // 뮤직 플레이어 꺼짐

        remote.onButtonPressed(4); // 명령 슬롯이 초기화 되어 있지 않습니다.
        remote.offButtonPressed(4);  // 명령 슬롯이 초기화 되어 있지 않습니다.
    }
}
