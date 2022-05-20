package math.problems;

public class MakePyramid {
    public static void main(String[] args)   {

        //*   Implement a large Pyramid of stars in the screen with java.

         //*
         //* *
         //* * *
         //* * * *
         //* * * * *
         //* * * * * *
     // int rows = 6;

      //for (int i = 1; i <= rows; ++i)  {
      //for(int j =1; j <= i; ++j)  {
      //System.out.print("* ");
      //}
      //System.out.println();
      }

      public static void drawPyramidOfNumbers ()  {
    for (int i =0; i < 5; i++)  {
        for (int j = 0; j< 5 - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(k + " ") ;  }
        System.out.println();
        }
    }
      }



