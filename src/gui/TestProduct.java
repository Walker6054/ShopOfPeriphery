package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import periphery.Stockroom;

public class TestProduct extends JFrame{
  private JPanel mainPanel;
  private JPanel buttPanel;
  private JTextArea text;
  public  JButton exit;

    public TestProduct (String nameShop, String typeProd) {
        super("Проверка "+typeProd+" из магазина "+nameShop);
        mainPanel = new JPanel();
        buttPanel = new JPanel();
        text = new JTextArea();
        exit = new JButton("Вернуться назад");
        int k=-1;
        String s="";
                
        this.add(mainPanel);
        
        //объявление layout
        GridLayout gridButtLay = new GridLayout(1, 1);
        BorderLayout borMainLay = new BorderLayout();
        mainPanel.setLayout(borMainLay);
        buttPanel.setLayout(gridButtLay);
        
        //шрифт
        Font main = new Font("MainFont", Font.BOLD, 25);
        Font butt = new Font("ButtFont", Font.BOLD, 30);
        
        //редактирования свойств текста
        text.setFont(main);
        text.setEditable(false);
        exit.setFont(butt);
        
        
        switch (nameShop) {
            
          case "DNS" : switch (typeProd) {
                         case "Компьютерная мышь" : try {
                                                      for (int i=0; i<Stockroom.DnsProd.size(); i++) {
                                                        if (Stockroom.DnsProd.get(i) instanceof periphery.ComputerMouse) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.DnsProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                          case "Монитор" : try {
                                                      for (int i=0; i<Stockroom.DnsProd.size(); i++) {
                                                        if (Stockroom.DnsProd.get(i) instanceof periphery.MonitorScreen) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.DnsProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                          case "Колонки" : try {
                                                      for (int i=0; i<Stockroom.DnsProd.size(); i++) {
                                                        if (Stockroom.DnsProd.get(i) instanceof periphery.Speakers) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.DnsProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                       }
                       break;
            
          case "Эльдорадо" : switch (typeProd) {
                                case "Компьютерная мышь" : try {
                                                      for (int i=0; i<Stockroom.EldProd.size(); i++) {
                                                        if (Stockroom.EldProd.get(i) instanceof periphery.ComputerMouse) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.EldProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                                case "Монитор" : try {
                                                      for (int i=0; i<Stockroom.EldProd.size(); i++) {
                                                        if (Stockroom.EldProd.get(i) instanceof periphery.MonitorScreen) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.EldProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                                case "Колонки" : try {
                                                      for (int i=0; i<Stockroom.EldProd.size(); i++) {
                                                        if (Stockroom.EldProd.get(i) instanceof periphery.Speakers) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.EldProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                             }
                             break;
            
          case "МВидео" : switch (typeProd) {
                            case "Компьютерная мышь" : try {
                                                      for (int i=0; i<Stockroom.MvidProd.size(); i++) {
                                                        if (Stockroom.MvidProd.get(i) instanceof periphery.ComputerMouse) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.MvidProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                            case "Монитор" : try {
                                                      for (int i=0; i<Stockroom.MvidProd.size(); i++) {
                                                        if (Stockroom.MvidProd.get(i) instanceof periphery.MonitorScreen) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.MvidProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                             case "Колонки" : try {
                                                      for (int i=0; i<Stockroom.MvidProd.size(); i++) {
                                                        if (Stockroom.MvidProd.get(i) instanceof periphery.Speakers) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.MvidProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                             }
                             break;
            
          case "Снежный барс" : switch (typeProd) {
                                  case "Компьютерная мышь" : try {
                                                      for (int i=0; i<Stockroom.SnowProd.size(); i++) {
                                                        if (Stockroom.SnowProd.get(i) instanceof periphery.ComputerMouse) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.SnowProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                                  case "Монитор" : try {
                                                      for (int i=0; i<Stockroom.SnowProd.size(); i++) {
                                                        if (Stockroom.SnowProd.get(i) instanceof periphery.MonitorScreen) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.SnowProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                                  case "Колонки" : try {
                                                      for (int i=0; i<Stockroom.SnowProd.size(); i++) {
                                                        if (Stockroom.SnowProd.get(i) instanceof periphery.Speakers) {
                                                            k=i;
                                                            break;
                                                        }  
                                                      }
                                                      s=Stockroom.SnowProd.get(k).connected();
                                                    } catch (Exception e) {
                                                        s="Товара данного типа нет на складе, \nдобавьте пожалуйста.";
                                                      }  
                                                    break;
                             }
                             break;
            
        }
        
        text.setText(s);
        mainPanel.add(text, BorderLayout.CENTER);
        buttPanel.add(exit);
        mainPanel.add(buttPanel, BorderLayout.SOUTH);
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TestProduct.this.setVisible(false);
            }
        });
        
    }
}
