/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrotation;

/**
 *
 * @author Uthman Alibalogun
 */
public class ArrayRotation {

    /**
     * @param args the command line arguments
     */
    static int[] rotLeft(int[] a , int d){
     int currentIndex = 0;
     int newIndex = 0;
     int tempValue = a[currentIndex];
     int newValue = a[currentIndex];
     
     int count = 0;
     int arrayLength = a.length;
     
     while( count < arrayLength){
        currentIndex = newIndex;
        
         //Equation for the new index for the current value
         newIndex = (arrayLength - (d % arrayLength) + currentIndex ) % arrayLength;
         
         // Takes the value at the new index and stores it to a temp variable
         tempValue = a[newIndex];
         
         //Assign the value to its new index position
         a[newIndex] = newValue;
         
         newValue = tempValue;
         count++;
     
     }
     
     
     return a;
    
    }
    
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5,};
        rotLeft(array, 4);
        
        for(int i = 0 ; i < array.length ; i++){
        System.out.print(" "+ array[i]);
        }
        
    }
    
}
