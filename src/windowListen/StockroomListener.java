package windowListen;

import gui.Menu;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class StockroomListener implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e) {
      Menu.flagMain=false;      
    }
    @Override
    public void windowClosed(WindowEvent e) {
      Menu.flagMain=true;     
    }
    @Override
    public void windowClosing(WindowEvent e) {
      Menu.flagMain=true;
    }
    
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    
}
