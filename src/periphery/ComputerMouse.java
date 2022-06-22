package periphery;

public class ComputerMouse extends Periphery implements ExpiredProduct{
  
  private String SensorType;
    
  public ComputerMouse (String SenType) {
    this.SensorType=SenType; 
  }
    
  @Override
  public String connected () {
    String s="";  
      s+="\nТип сенсора мыши: "+SensorType+"\n";
      s+="\nУстройство подключено...";
      s+="\nКоординаты перемещения передаются...\n";
      s+="\nТовар исправен и полностью пригоден \nк использованию!";
    return s;
  }
  
  @Override
  public String toString() {
      String s;
      s = "Компьютерная мышь"
        + "\n     Тип сенсора: "+SensorType;
      return s;
  }
    
}
