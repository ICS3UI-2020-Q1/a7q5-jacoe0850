/**
 *
 * @jacoe0850 
 */
public class Main {
  // creates a procedure method with method name firstDigit and paramater is whatever integer they enter
public static void firstDigit(int num){
  // if statement that mutliplies any negative number by -1
if(num < 0){
  num = num*-1;
}
while(num > 10){
  num = num / 10;
}
//prints and calculates the final digit
    System.out.println(num % 10);
}
  
  public static void main(String[] args) {
    firstDigit(-87893);
    
    
  }
}
