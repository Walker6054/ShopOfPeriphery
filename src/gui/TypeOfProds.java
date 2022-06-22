package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import windowListen.AddProductListener;

public class TypeOfProds extends JFrame{      /*положить в центр jpanel перед этим вызвать метод setlayout и использовать gridlayout создать новый*/
    private JPanel mainPanel;
    private JPanel buttPanel;
    private JTextField text;
  //кнопки магазинов
    public static JButton CompMouse;
    public static JButton MonScreen;
    public static JButton Speakers;
    
  public TypeOfProds (String name, int count) {   
    super("Выбор категории товара");
    text = new JTextField("");
    CompMouse = new JButton("Компьютерная мышь");
    MonScreen = new JButton("Монитор");
    Speakers = new JButton("Колонки");
    mainPanel = new JPanel();
    buttPanel = new JPanel();
    
    //объявление считывателя состояния окна
    WindowListener TypeListener = new AddProductListener();
    this.addWindowListener(TypeListener);
        
    this.add(mainPanel);
      
    //объявление layout
    BorderLayout borMainLay = new BorderLayout();
    BoxLayout boxDopLay = new BoxLayout(buttPanel,WIDTH);
    mainPanel.setLayout(borMainLay);
    buttPanel.setLayout(boxDopLay);
   
    //шрифт
    Font main = new Font("MainFont", Font.BOLD, 20);
    Font butt = new Font("ButtFont", Font.CENTER_BASELINE, 20);
    
    //редактирования свойств текста
    text.setEditable(false); 
    text.setBackground(Color.ORANGE);
    text.setForeground(Color.WHITE);
    
    switch (name) {
        case "DNS" : text.setBackground(Color.ORANGE);
                     text.setForeground(Color.BLACK);
                     if (count==1) {
                       text.setText("Добавление товара на склад магазина DNS");              
                     } else {
                         text.setText("Проверка товара со склада магазина DNS");
                       }

                     break;
            
        case "Эльдорадо" : text.setBackground(Color.RED);
                           text.setForeground(Color.WHITE);
                           if (count==1) {
                             text.setText("Добавление товара на склад магазина Эльдорадо");             
                           } else {
                               text.setText("Проверка товара со склада магазина Эльдорадо");
                             }
                            break;
            
        case "МВидео" : text.setBackground(Color.RED);
                        text.setForeground(Color.WHITE);
                        if (count==1) {
                          text.setText("Добавление товара на склад магазина МВидео");
                        } else {
                            text.setText("Проверка товара со склада магазина МВидео");
                          }
                        break;
            
        case "Снежный барс" : text.setBackground(Color.CYAN);
                              text.setForeground(Color.WHITE);
                              if (count==1) {
                                text.setText("Добавление товара на склад магазина Снежный барс");
                              } else {
                                  text.setText("Проверка товара со склада магазина Снежный барс");
                                }
                              break;
            
    }
    
      
    //редактирование шрифта текста и кнопок
    text.setFont(main);
    CompMouse.setFont(butt);
    MonScreen.setFont(butt);
    Speakers.setFont(butt);
      
    //добавление всех элементов в главную панель
    mainPanel.add(text, BorderLayout.NORTH);
    mainPanel.add(CompMouse, BorderLayout.CENTER);
    mainPanel.add(MonScreen, BorderLayout.EAST);
    mainPanel.add(Speakers, BorderLayout.WEST);
    
 
    
    
    CompMouse.addActionListener(new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (count==1) {
            Menu.AddProd(name,"mouse");
          } else {
              Menu.TestProd(name, "Компьютерная мышь");
            }   
        }
    });
    MonScreen.addActionListener(new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (count==1) {
            Menu.AddProd(name,"monitor"); 
          } else {
              Menu.TestProd(name, "Монитор"); 
            }    
        }
    });
    Speakers.addActionListener(new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (count==1) {
            Menu.AddProd(name,"speakers");  
          } else {
              Menu.TestProd(name, "Колонки");  
            }    
        }
    });
    
  }    
}
