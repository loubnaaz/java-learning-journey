
import java.util.Scanner;
public class Demo {
    
    public static void main(String[] args) {
// System.clearout.println("hello");
// 1- while loop
// The while loop repeats a block of code as long as a condition is true. if we said i is 20 and i<5 thats false it wwont be executed
//     int i = 2;
//     while (i <= 20){
//         System.out.println("number" + " " + i );
//         i +=2;
       
// }

// 2- do while loop
//Ask a user to enter a number and keep asking until they enter a number greater than 10.
// int i = 5;
// do {
//     System.out.println("enter number " + " "+ i );
//     i++;
//     }
// while ( i>= 10  );


//  }
   
//     } 
// 3- for loop
// Print the multiplication table of 7 (from 1×7 to 10×7) using a for loop.

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
/*int rows = 5;
for(int i = 1; i <= rows; i++){
    for(int j = rows; j > i; j--){
        System.out.print( i + "  " + j );
    }
    
}*/
// 4- scanner 
//Ask a user to enter a number and keep asking until they enter a number greater than 10.
/*int num;
Scanner sc = new Scanner(System.in);
do{
    System.out.println("enter a number");

    num = sc.nextInt();


} while (num <=10 );

System.out.println("you have typed a number greather than 10");

sc.close();
*/
//5- exercices
// Print numbers from 1 to 10

/*for(int i=1 ; i<=10 ; i++)

{
    System.out.println(i);
}*/

//Sum of first 10 natural numbers

/*for(int i=1 ; i<=10 ; i++)

{
    int sum =i+1;

    System.out.println( sum);
}*/
// Print all odd numbers between 1 and 20
/*
int i = 1;
while ( i <= 20){
    if (i % 2 != 0){
             System.out.println(i);
    }i++;
}*/


//----------------
/*
Multiply:
1 × 5 = 5
5 × 4 = 20
20 × 3 = 60*/
/*int num;
Scanner sc =new Scanner(System.in);
System.out.println("enter a number");

num = sc.nextInt();

for (int i = 5 ; i>0 ; i--){

  System.out.println(i + " * " + num + "= " + " " + (i * num));
 

}


sc.close();*/


int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;
}
System.out.println("Sum = " + sum);

    }}