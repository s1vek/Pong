package PlayerVsPlayer;

public class Pvp {

    private PvpFrame frame;

    private PvpPanel panel;

    public Pvp() {

        this.panel = new PvpPanel();
        this.frame = new PvpFrame(panel);
        this.panel.requestFocus();

    }

}
