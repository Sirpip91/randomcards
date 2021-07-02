/*
* Bradley Allen
* 6/28/2021
* This is a program that will generate two sets of 5 random values that represent different playing cards.
* This program will use 2 functions to translate a random number to the correct card representation
* 1 set for player and 1 set for computer
*/

//This is the package allen
package allen;

//Importing Random number generator
import java.util.Random;

//Declaring the class
public class Cards {
	//declaring the two strings that will have the number name and the suit
	static String suit;
	static String numname;
	//integers to words function example is 1 -> "Ace"
	static void NumberWords(int num) {
		switch(num) {
		case 0:
			numname = "Ace";
			break;
		case 1:
			numname = "Two";
			break;
		case 2:
			numname = "Three";
		break;
		case 3:
			numname = "Four";
			break;
		case 4: 
			numname = "Five";
			break;
		case 5:
			numname = "Six";
			break;
		case 6:
			numname = "Seven";
			break;
		case 7:
			numname = "Eight";
			break;
		case 8:
			numname = "Nine";
			break;
		case 9:
			numname = "Ten";
			break;
		case 10:
			numname = "Jack";
			break;
		case 11:
			numname = "Queen";
			break;
		case 12: 
			numname = "King";
			break;
		}
	}
	//Suit function to find out what type of card the number represents
	static void SuitType(int num) {
		//Cards 0 - 12 are spades
		if(num >= 0 && num <= 12) {
			suit = " of Spades";
		//Cards 13 - 25 are hearts
		}else if(num >= 13 && num <= 25) {
			suit =" of Hearts";
		//Cards 26 - 38 are clubs
		}else if(num >= 26 && num <= 38) {
			suit =" of Clubs";
		//Cards 39 - 51 are diamonds
		}else if(num >= 39 && num <= 51) {
			suit = " of Diamonds";
		}
	}
	
	
	//Main Method
	public static void main(String args[]) {
		//declaring the random function
		Random random = new Random();
		
		//Computers random 5 cards
		System.out.println("*****Computer*****");
		//loop that iterates 5 times
		for(int i = 0; i<5; i++) {
			//creating two different random number generators rnum for amount of cards(51) and rcard for Ace - King.
			int rnum = random.nextInt(52);
			int rcard = random.nextInt(13);
			//running the two functions that change random number to card representation
			SuitType(rnum);
			NumberWords(rcard);
			//printing out the random cards
			System.out.println(numname + suit);
		}
		
		//Players random 5 cards
		System.out.println("*****Player*****");
		//loop that iterates 5 times
		for(int i = 0; i<5; i++) {
			//creating two different random number generators rnum for amount of cards(51) and rcard for Ace - King.
			int rnum = random.nextInt(52);
			int rcard = random.nextInt(13);
			//running the two functions that change random number to card representation
			SuitType(rnum);
			NumberWords(rcard);
			//printing out the random cards
			System.out.println(numname + suit);
		}
	}
}
