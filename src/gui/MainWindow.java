package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import gui.*;

public class MainWindow extends JFrame{
  private JPanel mainPanel;
  private JPanel buttPanel;
  private JTextArea text;
//кнопки магазинов
  private JButton dns;
  private JButton snowbars;
  private JButton eldorado;
  private JButton mvideo;
  
  public MainWindow () {
      super("Магазины");
      text = new JTextArea("Выберите один из предложенных магазинов для просмотра или изменения содержимого их склада");
      dns = new JButton("DNS");
      snowbars = new JButton("Снежный барс");
      eldorado = new JButton("Эльдорадо");
      mvideo = new JButton("МВидео");
      mainPanel = new JPanel();
      buttPanel = new JPanel();
      
      this.add(mainPanel);
      
      //объявление layout
      BorderLayout borMainLay = new BorderLayout();
      GridLayout gridButtLay = new GridLayout(4, 1);
      mainPanel.setLayout(borMainLay);
      buttPanel.setLayout(gridButtLay);
      
      //шрифт
      Font main = new Font("MainFont", Font.ITALIC, 20);
      Font butt = new Font("ButtFont", Font.CENTER_BASELINE, 30);
      
      //редактирования свойств текста
      text.setEditable(false); 
      text.setLineWrap(true);
      text.setWrapStyleWord(true);
      
      //редактирование шрифта текста и кнопок
      text.setFont(main);
      dns.setFont(butt);
      snowbars.setFont(butt);
      eldorado.setFont(butt);
      mvideo.setFont(butt);
      
      //изменение фона кнопок
      dns.setBackground(Color.ORANGE); dns.setForeground(Color.BLACK); 
      mvideo.setBackground(Color.RED); mvideo.setForeground(Color.WHITE);
      eldorado.setBackground(Color.RED); eldorado.setForeground(Color.WHITE);
      snowbars.setBackground(Color.CYAN); snowbars.setForeground(Color.WHITE);
      
      //добавление кнопок в панель
      buttPanel.add(mvideo);
      buttPanel.add(dns);
      buttPanel.add(snowbars);
      buttPanel.add(eldorado);
      
      //добавление всех элементов в главную панель
      mainPanel.add(text, BorderLayout.NORTH);
      mainPanel.add(buttPanel, BorderLayout.CENTER);
      
      dns.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            Menu.stockControl("DNS");            
          } 
          
      });
      
      snowbars.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            Menu.stockControl("Снежный барс");
          } 
      });
      
      eldorado.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            Menu.stockControl("Эльдорадо");
          } 
      });
      
      mvideo.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            Menu.stockControl("МВидео");
          } 
      });
          
  }    
    
}
