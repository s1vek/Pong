package MenuUI;

public class Menu {

    private MenuFrame menuFrame;

    private MenuPanel menuPanel;

    public Menu () {

        this.menuPanel = new MenuPanel();
        this.menuFrame = new MenuFrame(menuPanel);
        this.menuPanel.requestFocus();

    }
}
