package windowListen;

import gui.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AddProductListener implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e) { 
      gui.StockroomWindow.one.setEnabled(false);
      gui.StockroomWindow.four.setEnabled(false);
    }
    @Override
    public void windowClosed(WindowEvent e) { 
      gui.StockroomWindow.one.setEnabled(true);
      gui.StockroomWindow.four.setEnabled(true);
    }
    @Override
    public void windowClosing(WindowEvent e) {
      gui.StockroomWindow.one.setEnabled(true);
      gui.StockroomWindow.four.setEnabled(true);
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
