package Main;

import java.util.Scanner;

/*Find minimum number of currency notes and values that sum to given amount
Given an amount, find the minimum number of notes of different denominations that sum upto the given amount. Starting from the highest denomination note, try to accommodate as many notes possible for given amount.

We may assume that we have infinite supply of notes of values {2000, 500, 200, 100, 50, 20, 10, 5, 1}*/

public class CurrencyNotes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int amount = input.nextInt();
        int[] notes = new int[] {2000,500,200,100,50,20,10,5,2,1};
        int[] notesCount = new int[notes.length];
        
        for(int i=0;i<notes.length;i++){
        	if(amount >= notes[i]){
        		
        		notesCount[i] = amount / notes[i];
//        		System.out.println(notes[i] * notesCount[i] );
        		amount = amount - notes[i] * notesCount[i] ;
        	}
        }
        System.out.println("Note Split up:");
        for(int i=0;i<notes.length;i++) {
        	System.out.println(notes[i] +" - "+ notesCount[i] );
        }
	}

}
