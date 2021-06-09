package command_pattern;

public class MusicPlayerOnCommand implements Command{
    private MusicPlayer musicPlayer;

    public MusicPlayerOnCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.on();
    }

    @Override
    public void undo() {
        System.out.println("-----작업 취소-----");
        musicPlayer.off();
    }
}
