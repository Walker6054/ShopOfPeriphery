package gui;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowListener;
import javax.swing.*;
import periphery.Stockroom;
import windowListen.ContentListener;

public class ContentOfStockroom extends JFrame{
  private JPanel mainPanel;
  private JTextArea list;
  private JScrollPane scroll;
  
    public ContentOfStockroom(String name, int status) {
        super("Содержимое склада магазина "+ name);
        mainPanel = new JPanel();
        list = new JTextArea();
        String s="";
                
        this.add(mainPanel);
        
        //объявление слушателя окна
        WindowListener ContentListen = new ContentListener();
        this.addWindowListener(ContentListen);
        
        //объявление layout
        GridLayout gridMainLay = new GridLayout(1, 1);
        mainPanel.setLayout(gridMainLay);
        
        //объявление скроллбара
        scroll = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        //шрифт
        Font main = new Font("MainFont", Font.BOLD, 25);
        
        //редактирования свойств текста
        list.setFont(main);
        list.setEditable(false);
        
        
        switch (name) {
          case "DNS" : if (status==1) s=Stockroom.WritingOut(Stockroom.DnsProd);
                         else s=Stockroom.WritingOutExpiredProduct(Stockroom.DnsProd); 
                       break;
            
          case "Эльдорадо" : if (status==1) s=Stockroom.WritingOut(Stockroom.EldProd);
                               else s=Stockroom.WritingOutExpiredProduct(Stockroom.EldProd);
                             break;
            
          case "МВидео" : if (status==1) s=Stockroom.WritingOut(Stockroom.MvidProd);
                            else s=Stockroom.WritingOutExpiredProduct(Stockroom.MvidProd);
                          break;
            
          case "Снежный барс" : if (status==1) s=Stockroom.WritingOut(Stockroom.SnowProd); 
                                  else s=Stockroom.WritingOutExpiredProduct(Stockroom.SnowProd);
                                break;
            
        }
        
        if (s=="") {
          JOptionPane.showMessageDialog(mainPanel, "На складе нет товара.", "Сообщение", JOptionPane.INFORMATION_MESSAGE);
        } else list.setText(s);
        
        mainPanel.add(scroll); 
        
        
        
    }
}
