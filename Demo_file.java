public class Demo {
    
    public static void main(String[] args) {
   // System.clearout.println("hello");

//The while loop repeats a block of code as long as a condition is true. if we said i is 20 and i<5 thats false it wwont be executed
    int i = 2;
    while (i <= 20){
        System.out.println("number" + " " + i );
        i +=2;
       
}

//Ask a user to enter a number and keep asking until they enter a number greater than 10.
// int i = 5;
// do {
//     System.out.println("enter number " + " "+ i );
//     i++;
//     }
// while ( i>= 10  );


//  }
   
//     } 

// 3- Print the multiplication table of 7 (from 1×7 to 10×7) using a for loop.

// for (int i= 1; i <= 10; i++){
//     System.out.println( " 7 * "+ i +" = " + i*7 );
// }


//Print a pyramid of stars with 5 rows:

// for (int i = 1; i <=5 ; i++){
//     for(int j = 1; j <=5 ; j++){
//          System.out.println(  " * " );
//     }
// }
//Create an array of names {"Alice", "Bob", "Charlie"} and print each name with a greeting.

// String names [] = {"Alice", "Bob", "Charlie"} ;
// for ( String n : names ){
//            System.out.println( "hello " + n );
// }
// Write a program that prints numbers 1 to 50, but:

// If divisible by 3 → print "Fizz"

// If divisible by 5 → print "Buzz"

// If divisible by both → print "FizzBuzz"

// This is a classic interview question that tests loops and logic.
/*

for ( int i=1 ; i<=30; i++){
    if (i % 3 == 0){
         System.out.println(i + " is divisible by 3");
    }
  else if (i % 5 == 0){
         System.out.println(i + " is divisible by 5");
    }
     else if (i % 5 == 0 && i % 3 == 0){
         System.out.println(i + " is divisible by 3 and 5 ");
    }else {
        System.out.println(i);
    }
}

*/
//Print a pyramid of stars with 5 rows:
for (int i = 1 ; i<= 4 ; i++){
    for (int j = 1 ; j<= 4 ; j++){

              System.out.println(i + j );
    }
}Demo 





















    }}