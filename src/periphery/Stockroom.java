package periphery;
import java.util.ArrayList;

public class Stockroom {
  
  public static ArrayList<Periphery> DnsProd = new ArrayList<Periphery>(30);
  public static ArrayList<Periphery> SnowProd = new ArrayList<Periphery>(30);
  public static ArrayList<Periphery> MvidProd = new ArrayList<Periphery>(30);
  public static ArrayList<Periphery> EldProd = new ArrayList<Periphery>(30);
  
  public static void StartAddProd () {
    Stockroom.DnsProd.add(new ComputerMouse ("Лазерный"));
    Stockroom.DnsProd.add(new ComputerMouse ("Оптический"));
    Stockroom.DnsProd.add(new MonitorScreen ("OLED"));
    Stockroom.DnsProd.add(new MonitorScreen ("VA/MVA"));
    Stockroom.DnsProd.add(new MonitorScreen ("IPS"));
    Stockroom.DnsProd.add(new Speakers (4));
    
    Stockroom.MvidProd.add(new ComputerMouse ("Лазерный"));
    Stockroom.MvidProd.add(new ComputerMouse ("Оптический"));
    Stockroom.MvidProd.add(new MonitorScreen ("OLED"));
    Stockroom.MvidProd.add(new MonitorScreen ("VA/MVA"));
    Stockroom.MvidProd.add(new MonitorScreen ("IPS"));
    Stockroom.MvidProd.add(new Speakers (4));
  }
  
  public static String WritingOut (ArrayList<Periphery> list) {
    String s="";
    if (list.size()!=0) {
        s+="Содержимое склада:\n";
        for (int i=0; i<list.size(); i++) {
          s+="\n"+(i+1)+") ";
          s+=list.get(i).toString()+"\n";
        }
    }
    return s;
  }
  
  public static String WritingOutExpiredProduct(ArrayList<Periphery> list) {
    String s="";
    int k=0;
    
    if (list.size()!=0) {
        s+="Товар cо склада с возможно \nистекающим сроком годности:\n";
        for (int i=0; i<list.size(); i++) {
          if (list.get(i) instanceof ExpiredProduct) {
            k++;
            s+="\n"+(k)+") ";
            s+=list.get(i).toString()+"\n";
          }
        }
    }
    return s;
  }
  
  public static void CleanStockroom (String name) {
    switch (name) {
        case "DNS" : while (Stockroom.DnsProd.size()!=0) {
                         Stockroom.DnsProd.remove(0); 
                     }
                     break;
            
        case "Эльдорадо" : while (Stockroom.EldProd.size()!=0) {
                             Stockroom.EldProd.remove(0); 
                           } 
                           break;
            
        case "МВидео" : while (Stockroom.MvidProd.size()!=0) {
                          Stockroom.MvidProd.remove(0); 
                        }
                        break;
            
        case "Снежный барс" : while (Stockroom.SnowProd.size()!=0) {
                                Stockroom.SnowProd.remove(0); 
                              }
                              break;
            
    }
  }
  
  
}