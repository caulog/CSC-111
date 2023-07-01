# CSC 111 Lab 3: Input & Output Part 2
Learning objectives:
1. Use loop structures correctly
2. Identify the type of loop implementation required to solve a given problem

## Multiplication Quiz
Objective: Create a Java app, called MultiplicationQuiz.java that helps elementary students learn their multiplication tables by creating a random quiz of multiplication problems.

## Implementing Black Jack
Objective: Implement a simplified version of Blackjack with the following rules:
1. The stack of cards is of unlimited supply. That is, there can be as many 1s, 2s, 3s, etc. This is weird but makes the implementation way simpler for us.
2. The cards in the stack are between 1 and 11 and they are all of the same suite. Again, this simplifies our implementation. We model the card stack by generating random integers between 1 and 11.
3. When it’s the player’s turn, the the player always receives the first card without being prompted. That is, the player doesn’t ask for a hit the first time around.
4. After the first card, the player can choose to ask for another card (hit me again!) or to stop drawing cards (I’m done).
5. When it’s the dealers turn, the dealer gets cards automatically while his score is less than or equal to 17.
6. If the player score goes above 21, he doesn’t automatically lose. The dealer must play to see if his score is also less than 21. If the dealer score is also greater than 21 then we have a tie (both lose).
7. If the player and the dealer scores are the same, then it’s a tie.
8. The player wins if their score is less than or equal to 21 and is greater than the score of the dealer. The same condition applies for the dealer score
