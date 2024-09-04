import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      System.out.print("Choose the mode: [1] Y to RUB, [2] RUB to Y: >");
      Scanner modeSc = new Scanner(System.in);
      int modeInt = modeSc.nextInt();
       
      if (modeInt == 1) {
          final double ROUBLES_PER_YUAN = 11.91;
          Scanner input = new Scanner(System.in); // System.in это стандартный поток ввода
          int yuan = input.nextInt();
          double roubles = ROUBLES_PER_YUAN * yuan;
          int roundedRoubles = (int) Math.round(roubles);
  // Math это класс, а round() это его статический метод
        
          int digit;
          digit = roundedRoubles % 10;
        
          if (digit == 1) {
               System.out.print(roubles + " рубль");
          } else if (digit == 2 || digit == 3 || digit == 4) {
               System.out.print(roubles + " рубля");
          } else {
               System.out.print(roubles + " рублей");
          } 
      } else if (modeInt == 2) {
          final double YUAN_PER_ROUBLE = 0.080;
          Scanner input = new Scanner(System.in);
          int roubles = input.nextInt();
          double yuan = YUAN_PER_ROUBLE * roubles;
          int roundedYuan = (int) Math.round(yuan);
        
          int digit;
          digit = roundedYuan % 10;
        
          if (digit == 1) {
              System.out.print(yuan + " юань");
          } else if (digit == 2 || digit == 3 || digit == 4) {
              System.out.print(yuan + " юаня");
          } else {
              System.out.print(yuan + " юаней");
          } 
      }
   }
}
