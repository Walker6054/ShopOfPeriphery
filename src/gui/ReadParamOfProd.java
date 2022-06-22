package gui;

import gui.TypeOfProds;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import periphery.ComputerMouse;
import periphery.MonitorScreen;
import periphery.Periphery;
import periphery.Speakers;


public class ReadParamOfProd extends JFrame{
    private JPanel mainPanel;
    private JTextField text;
  //выпадающий список с параметрами товаров
    private JComboBox Paraments;
    private static final String[] paramCompMouse = {"Лазерный","Оптический"};
    private static final String[] paramMonScreen = {"VA/MVA","IPS","LED"};
    private static final String[] paramSpeakers = {"2","3","4","5","6","7","8","9"};
  //кнопка добавить товар
    private JButton AddButt; 

    public ReadParamOfProd(String name, String type) {
        super("Выбор категории товара");
        text = new JTextField("Выберите параметр товара для добавления на склад мазагина "+name);
        mainPanel = new JPanel();
        AddButt = new JButton("Добавить товар");
        
        this.add(mainPanel);
        
        
      
      //объявление layout
      GridLayout gridMainLay = new GridLayout(3, 1);
      mainPanel.setLayout(gridMainLay);
   
      //шрифт
      Font main = new Font("MainFont", Font.BOLD, 17);
      Font butt = new Font("ButtFont", Font.CENTER_BASELINE, 30);
    
      //редактирования свойств текста
      text.setEditable(false); 
      text.setBackground(Color.WHITE);
      text.setForeground(Color.BLACK);
      switch (type) {
          case "mouse" : Paraments = new JComboBox(paramCompMouse);
                       break;
            
          case "monitor" : Paraments = new JComboBox(paramMonScreen);                          
                         break;
            
          case "speakers" : Paraments = new JComboBox(paramSpeakers);
                          break;

      }
    
      //редактирование шрифта текста и кнопок
      text.setFont(main);
      AddButt.setFont(butt);
      Paraments.setFont(butt);
      
      //добавление всех элементов в главную панель
      mainPanel.add(text);
      mainPanel.add(Paraments);
      mainPanel.add(AddButt);
      
      //деактивация кнопок в меню выбора товара
      TypeOfProds.MonScreen.setEnabled(false);
      TypeOfProds.CompMouse.setEnabled(false);
      TypeOfProds.Speakers.setEnabled(false);
      
      AddButt.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              int select = Paraments.getSelectedIndex();
              switch (name) {
                  case "DNS" : try {
                                 periphery.Stockroom.DnsProd.add(createNewPeriphery(type,select));
                                 JOptionPane.showMessageDialog(Paraments, "Товар успешно добавлен на склад магазина "+name, "Сообщение", JOptionPane.INFORMATION_MESSAGE);
                               } catch (Exception ex) {
                                   JOptionPane.showMessageDialog(Paraments, "Произошла ошибка в добавлении на склад товара, возможно склад переполнен", "Предупреждение", JOptionPane.ERROR_MESSAGE);
                               }
                               break;
            
                  case "Эльдорадо" : try {
                                       periphery.Stockroom.EldProd.add(createNewPeriphery(type,select));
                                       JOptionPane.showMessageDialog(Paraments, "Товар успешно добавлен на склад магазина "+name, "Сообщение", JOptionPane.INFORMATION_MESSAGE);
                                     } catch (Exception ex) {
                                         JOptionPane.showMessageDialog(Paraments, "Произошла ошибка в добавлении на склад товара, возможно склад переполнен", "Предупреждение", JOptionPane.ERROR_MESSAGE);
                                       }
                                     break;
            
                  case "МВидео" : try {
                                    periphery.Stockroom.MvidProd.add(createNewPeriphery(type,select));
                                    JOptionPane.showMessageDialog(Paraments, "Товар успешно добавлен на склад магазина "+name, "Сообщение", JOptionPane.INFORMATION_MESSAGE);
                                  } catch (Exception ex) {
                                      JOptionPane.showMessageDialog(Paraments, "Произошла ошибка в добавлении на склад товара, возможно склад переполнен", "Предупреждение", JOptionPane.ERROR_MESSAGE);
                                    }
                                  break;
            
                  case "Снежный барс" : try {
                                          periphery.Stockroom.SnowProd.add(createNewPeriphery(type,select));
                                          JOptionPane.showMessageDialog(Paraments, "Товар успешно добавлен на склад магазина "+name, "Сообщение", JOptionPane.INFORMATION_MESSAGE);
                                        } catch (Exception ex) {
                                            JOptionPane.showMessageDialog(Paraments, "Произошла ошибка в добавлении на склад товара, возможно склад переполнен", "Предупреждение", JOptionPane.ERROR_MESSAGE);
                                          }
                                        break;
              }
              
              TypeOfProds.MonScreen.setEnabled(true);
              TypeOfProds.CompMouse.setEnabled(true);
              TypeOfProds.Speakers.setEnabled(true);
              AddButt.setEnabled(false);
              Paraments.setEnabled(false);
              ReadParamOfProd.this.setVisible(false);
          }
      });
 
    }
    
    public static Periphery createNewPeriphery (String typePeriphery, int select) {
      Periphery product=null;
      switch (typePeriphery) {
          case "mouse" : product = new ComputerMouse(paramCompMouse[select]);
                         break;
            
          case "monitor" : product = new MonitorScreen(paramMonScreen[select]);
                           break;
            
          case "speakers" : product = new Speakers(Integer.parseInt(paramSpeakers[select]));
                            break;

      }  
      return (product);
    }
}
