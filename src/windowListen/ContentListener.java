package windowListen;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import gui.ContentOfStockroom.*;

public class ContentListener implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e) {
      gui.StockroomWindow.two.setEnabled(false);
      gui.StockroomWindow.five.setEnabled(false);
    }
    @Override
    public void windowClosing(WindowEvent e) {
      gui.StockroomWindow.two.setEnabled(true);
      gui.StockroomWindow.five.setEnabled(true);       
    }
    
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}   
}
