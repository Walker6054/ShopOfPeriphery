package gui;

import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import periphery.Stockroom;

public class Menu{

  public static boolean flagMain=true;
    
  public static void main(String[] args) {
           
    MainWindow window = new MainWindow();
    window.setSize(500,320);
    window.setLocation(400, 200);
    window.setVisible(flagMain);
    window.setResizable(false);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    Stockroom.StartAddProd();
    
    while (true) {
      window.setVisible(flagMain);  
    }
    
  }
  
  public static void stockControl (String name) {
    StockroomWindow stockWindow = new StockroomWindow(name);
    stockWindow.setSize(600,300);
    stockWindow.setLocation(400, 300);
    stockWindow.setVisible(true);
    stockWindow.setResizable(false); 
  }
  
  public static void typeProd (String name, int count) {
    TypeOfProds typeOfProds = new TypeOfProds(name,count);
    typeOfProds.setSize(600,300);
    typeOfProds.setLocation(400, 400);
    typeOfProds.setVisible(true);
    typeOfProds.setResizable(false);  
  }
  
  public static void AddProd (String name, String typeProd) {
    ReadParamOfProd addNewProd = new ReadParamOfProd(name,typeProd);
    addNewProd.setSize(600,300);
    addNewProd.setLocation(400, 500);
    addNewProd.setVisible(true);
    addNewProd.setResizable(false); 
  }
  
  public static void ShowProd (String name, int status) {
    ContentOfStockroom showProd = new ContentOfStockroom(name, status);
    showProd.setSize(500,400);
    showProd.setLocation(400, 500);
    showProd.setVisible(true);
    showProd.setResizable(false); 
  }
  
  public static void TestProd (String nameShop, String typeProd) {
    TestProduct testProd = new TestProduct(nameShop, typeProd);
    testProd.setSize(600,400);
    testProd.setLocation(400, 500);
    testProd.setVisible(true);
    testProd.setResizable(false); 
  }       
}
