
// import java.util.*;

// public class Add{
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("enter the week number in 1-7 : ");
//     int num = sc.nextInt();
    
//     switch(num){

//         case 1 -> System.out.println("Monday");

//         case 2 -> System.out.println("tuesday");  

//         case 3 -> System.out.println("wendsday");

//         case 4 -> System.out.println("thursday");

//         case 5 -> System.out.println("friday");

//         case 6 -> System.out.println("saturday");

//         case 7 -> System.out.println("sunday");

//         default -> System.out.println("enter correct num plz!");                     
//     }
//    }
// }

//**Leap year**

import java.util.*;

public class Add{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter year : ");
    int y = sc.nextInt();
    if((y%4==0)&&((y%100!=0)||(y%400==0))){
        System.out.println("leap year");

    }else{
        System.out.println("not a leap year");
    }
  }
} 