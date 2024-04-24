package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerStartScreen implements ActionListener{
	private StartScreen screen;
	private SelectChamp select;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String check = e.getActionCommand();
		if(check.equals("START"))
		{
			new SelectChamp1();
		}
		else if(check.equals("OPTION"))
		{
			screen.showVolumeControlDialog();
		}
		else if(check.equals("EXIT"))
		{
			System.exit(0);
		}
	}
	/**
	 * @param screen
	 */
	public ControllerStartScreen(StartScreen screen) {
		this.screen = screen;
	}

}
