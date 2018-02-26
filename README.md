# Tic-Tac-Toe Game -
Tic Tac Toe Program in Java

General Outline:
Tic Tac Toe is a 2 player game where one "player x" enters 'x' and other "player o" enters 'o'. 
They play the game so that one of them can win by having 3 identical symbols like 'x (or) o' in a sequence (Columns,Rows,Diagonal).

**The default layout of the baord is as below**
-------------
| - | - | - | 
-------------
| - | - | - | 
-------------
| - | - | - |

Now players x & o need to play on it by filling values like below -
-------------
| x | o | o | 
-------------
| o | x | 0 | 
-------------
| o | x | 0 | 

#Total number of possibilities to win are 

First 3 possibilities*
Columns(3 Columns)
-------------
| o | o | o | 
-------------
| o | o | o | 
-------------
| o | o | o | 


Next 3 possibilities*
Rows(3 Rows)
-------------
| x | x | x | 
-------------
| x | x | x | 
-------------
| x | x | x | 


Next 2 possibilities*
Rows(2 Diagonal)
-------------
| x | o | x | 
-------------
| o | x | o | 
-------------
| x | o | x | 



# How to implement in JAVA  -

In code we will ask each player to enter a row number  and col number so we can place 'x' or 'o' on the board..
By default we make some assumptions that 'player x' plays first and 'player y' plays second.
'player x' enters his row and column no to fill in 'x' and then we will move to 'player y' and ask him to enter his row and column number to fill with 'o'. 
This way the game with move on till all the values are filled (or) till a winner is declared.

A tie is also possible - To check check if the game was a tie - We first check if board was full and there was no winner.
 

![Imgur Image](https://i.imgur.com/eyvpT41.gif)

