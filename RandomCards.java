/*
* Bradley Allen
* This is a program that will generate two sets of 5 random values that represent different playing cards.
* This program creates a deck of cards though arrays.
* Then the program shuffles the cards using a random number
* Finally 10 cards from the shuffled array are chosen 
* all of the cards are made so that non are duplicates. after shuffling 1-5 are for computer then 5-10
* are the players cards
*/

//This is the package allen
package allen;

//Importing Random number generator
import java.util.Random;


//Declaring the class
public class RandomCards {	
	//creating a array of suits
	static String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};

	// Array of strings for the numbers to words the index is converted
						//  [0]		[1]   [2]       [3]  ect.....
	static String[] numberwords = {"Ace","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
			"Queen", "King", };
	//creating the array of strings to contain the cards
   static String[] deck = new String[52];
	
   
	static void Deal() {
		//Shuffling the cards
		Draw();
		//printing computers cards
		System.out.println("*****Computer*****");
		// picking the first 5 cards off of the top of the deck
		for(int i = 0; i<5; i++) {
			System.out.println(deck[i]);
		}
		//printing players cards
		System.out.println("*****Player*****");
		//picking the next 5 cards from the top of the deck
		for(int i = 5; i<10; i++) {
			System.out.println(deck[i]);
		}
	}
	static void GenerateDeck() {
		  //Generates the deck of cards with 
		for(int i = 0; i< deck.length; i++) {
		//creates the deck      remainder of each index 
			deck[i] = numberwords[i%13] + " of " + suits[i/13];
			}
	}
	//This shuffles the cards
	static void Draw() {
		Random rand = new Random();
		//Shuffling the deck aka randomizing it
		for(int i = 0; i<deck.length; i++) {
			//random number index
			int index = rand.nextInt(52);
			//creating temporary place holder for the card 
			String a = deck[i];
			//moving the placeholder card to the random index
			deck[i] = deck[index];
			// making the random number the next placeholder.
			deck[index] = a;
		}
	}
	
public static void main(String[] args) {
	// Making the deck
	GenerateDeck();
	//Shuffling (Draw) Then Dealing
	Deal();
}
}
	

