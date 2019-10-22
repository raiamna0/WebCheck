
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muslimah
 */
public class Driver {
    
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        display(a,n);
        
        modifyArray(a); 
        System.out.printf("%n%nThe values of the modified array are:%n");
 
        for (int value : a)
        System.out.printf(" %d", value);
        System.out.printf("%n%nEffects of passing array element value:%n" + "array[3] before modifyElement: %d%n", a[3]);
        modifyElement(a[3]); 
        System.out.printf("array[3] after modifyElement: %d%n", a[3]);
       
    }
    
public static void display(int[] b,int m)
    {
        for(int i=0;i<m;i++)
        {
            System.out.println(b[i]+ " ");
        }
    }

public static void modifyArray(int[] array2)
{
for (int counter = 0; counter < array2.length; counter++)
array2[counter] *= 2;
}

// multiply argument by 2
public static void modifyElement(int element)
{
element *= 2;
System.out.printf(
"Value of element in modifyElement: %d%n", element);
}
}