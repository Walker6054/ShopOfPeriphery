package periphery;


public class MonitorScreen extends Periphery implements ExpiredProduct{
  
  private String DisplayType;
    
  public MonitorScreen (String DispType) {
    this.DisplayType=DispType; 
  }

  @Override
  public String connected() {
    String s="";
      s+="\nТип матрицы монитора: "+DisplayType+"\n";
      s+="\nУстройство подключено...";
      s+="\nИзображение выводится на экране...\n";
      s+="\nТовар исправен и полностью пригоден \nк использованию!";
      return s;
  }
  
  @Override
  public String toString() {
      String s;
      s = "Монитор"
        + "\n     Тип матрицы: "+DisplayType;
      return s;
  }
  
    
}
