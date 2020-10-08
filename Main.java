import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // Using scanner for inputs and do-while loop for your multiplication timestable
    int num, result;
    System.out.println("Input the number you want to check it's timestable.");
    Scanner scan = new Scanner(System.in);
    num = scan.nextInt();
    do{
      if (num == -1){
        System.out.println("That is the end of the multiplication timestable. I hope you check back someday");
        return;
      }

       System.out.println ("Timestable for " + num);
      for (int j = 1; j<=12; j++){
        result = multiply(num, j);
        if (j!=12){
          System.out.print(num + "x" + j + " = " + result + " ");

        }
        else{
          System.out.println(num + "x" + j + " = " + result + " ");
        }
      }
      System.out.println("Input the number you want to check it's timestable. To stop checking input -1");
      scan = new Scanner(System.in);
      num = scan.nextInt();
    }while(num != -1);
    
    System.out.println("That is the end of the multiplication timestable. I hope you check back someday");
  


    //Create Multiplication Timestable of users desired numbers
    
    //Accepting a single number from the command line
    //int num = Integer.parseInt(args[0]);
    
    // accepting strings from your command line and concatenating them
    /* String concat = args[0] + " " + args[1] + "!!!";
    System.out.println(concat);

    // your return ends your program abruptly
    return; */
    

    /*
    int i;
    int result;
    // for each loop that picks each of the inputs/arguements made on the command line
    for (String arg : args){
        i = Integer.parseInt(arg);
        System.out.println ("Timestable for " + i);
      for (int j = 1; j<=12; j++){
        result = multiply(i, j);
        
        
        if (j!=12){
          
          System.out.print(i + "x" + j + " = " + result + " ");

        }
        else{
          System.out.println(i + "x" + j + " = " + result + " ");
        }
       
      }
      
    }
    */



    //Example showing positions of your values in an array
    /*int[] number = {5, 6, 7, 8};
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]); */
  }

  static int multiply(int num1, int num2){
    return num1 * num2;
  }
}