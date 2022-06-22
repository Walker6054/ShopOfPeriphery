package gui;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import windowListen.StockroomListener;

public class StockroomWindow extends JFrame{
    private JPanel mainPanel;
    private JPanel buttPanel;
    private JTextField text;
  //кнопки магазинов
    public static JButton one;
    public static JButton two;
    private JButton three;
    public static JButton four;
    public static JButton five;
    
    
  public StockroomWindow (String name) {   
    super("Управление складом");
    text = new JTextField("");
    one = new JButton("Добавить товар на склад");
    two = new JButton("Просмотреть содержимое склада");
    three = new JButton("Очистить склад");
    four = new JButton("Проверить товар");
    five = new JButton("Просмотреть товар с истекающим сроком годности");
    mainPanel = new JPanel();
    buttPanel = new JPanel();
    
    //объявление считывателя состояния окна
    WindowListener StockListen = new StockroomListener();
    this.addWindowListener(StockListen);
        
    this.add(mainPanel);
      
    //объявление layout
    BorderLayout borMainLay = new BorderLayout();
    GridLayout gridButtLay = new GridLayout(5, 1);
    mainPanel.setLayout(borMainLay);
    buttPanel.setLayout(gridButtLay);
      
    //шрифт
    Font main = new Font("MainFont", Font.BOLD, 35);
    Font butt = new Font("ButtFont", Font.CENTER_BASELINE, 20);
    
    //редактирования свойств текста
    text.setEditable(false); 
    text.setBackground(Color.ORANGE);
    text.setForeground(Color.WHITE);
    switch (name) {
        case "DNS" : text.setBackground(Color.ORANGE);
                     text.setForeground(Color.BLACK);
                     text.setText("DNS");
                     break;
            
        case "Эльдорадо" : text.setBackground(Color.RED);
                           text.setForeground(Color.WHITE);
                           text.setText("Эльдорадо");
                            break;
            
        case "МВидео" : text.setBackground(Color.RED);
                        text.setForeground(Color.WHITE);
                        text.setText("МВидео");
                        break;
            
        case "Снежный барс" : text.setBackground(Color.CYAN);
                              text.setForeground(Color.WHITE);
                              text.setText("Снежный барс");
                              break;
            
    }
    
      
    //редактирование шрифта текста и кнопок
    text.setFont(main);
    one.setFont(butt);
    two.setFont(butt);
    three.setFont(butt);
    four.setFont(butt);
    five.setFont(butt);
    
    //добавление кнопок в панель
    buttPanel.add(one);
    buttPanel.add(two);
    buttPanel.add(three);
    buttPanel.add(four);
    buttPanel.add(five);
      
    //добавление всех элементов в главную панель
    mainPanel.add(text, BorderLayout.NORTH);
    mainPanel.add(buttPanel, BorderLayout.CENTER);
    
    one.addActionListener(new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e) {
          Menu.typeProd(name,1);
        }
    });
    two.addActionListener(new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e) {
          Menu.ShowProd(name,1);
        }
    });
    three.addActionListener(new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e) {
          periphery.Stockroom.CleanStockroom(name);
          JOptionPane.showMessageDialog(mainPanel, "Склад магазина "+name+" очищен!", "Очистка склада", JOptionPane.INFORMATION_MESSAGE);
        }
    });
    four.addActionListener(new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e) {
          Menu.typeProd(name,2);    
        }
    });
    five.addActionListener(new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e) {
          Menu.ShowProd(name,2);    
        }
    });
  }
 
  
  
}
