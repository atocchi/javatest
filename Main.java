public class Main {
    public static void main(String[] args) {
      int i = (int)(Math.random() * 20);
      while(i < 20){
        if(i == 19){
        System.out.println("Goose");
        i = i + 1;
        }
        else{
        System.out.println("Duck");
        i = i + 1;
        }
      }
    }
  }