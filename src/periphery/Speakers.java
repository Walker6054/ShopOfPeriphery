package periphery;

public class Speakers extends Periphery{
 
  private int NumberOfSpeakers;
  private final int NumberOfSubwoofers=1;
    
  public Speakers (int NumOfSpeak) {
    this.NumberOfSpeakers=NumOfSpeak;
  }
    
  @Override
  public String connected () {
    String s="";
      s+="Тип аудиосистемы: "+NumberOfSpeakers+' '+NumberOfSubwoofers;
      s+="\nКоличество динамиков: "+NumberOfSpeakers;
      s+="\nКоличество сабвуферов: "+NumberOfSubwoofers+"\n";
      s+="\nУстройство подключено...";
      s+="\nКоординаты перемещения передаются...\n";
      s+="\nТовар исправен и полностью пригоден \nк использованию!";
      return s;
  }
  
  @Override
  public String toString() {
      String s;
      s = "Ауидиосистема"
        + "\n     Количество колонок: "+NumberOfSpeakers
        + "\n     Количество сабвуферов: "+NumberOfSubwoofers;
      return s;
  }
    
}
