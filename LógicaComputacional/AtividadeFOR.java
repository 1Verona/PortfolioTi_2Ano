import java.util.Scanner;
public class Main 
{
  public static void main(String[] args) {
    Scanner alberto = new Scanner(System.in);
    int n = alberto.nextInt();
    for(int i = 1; i<n; i++){
      int d = 0;
      for(int j = i; j > 0; j--){
        if(i % j == 0){
          d++
       }
      
     }
     if (d == 2){
       System.out.println(i);
     }
  }
}
}
