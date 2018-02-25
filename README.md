# Tic-Tac-Toe Game -
Tic Tac Toe Program in Java

General Outline:
Tic Tac Toe is a 2 player game where one "player x" enters 'X' and other "player o" enters 'o'. They play the game so that one of them can with by having 3 identical chars/symbols like 'x/o' in a line(Columns,Rows,Diagonal).

The default layout of the baord is as below-
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

*First 3 possibilities*
Columns(3 Columns)
-------------
| o | o | o | 
-------------
| o | o | o | 
-------------
| o | o | o | 


*Next 3 possibilities*
Rows(3 Rows)
-------------
| x | x | x | 
-------------
| x | x | x | 
-------------
| x | x | x | 


*Next 3 possibilities*
Rows(Diagonal)
-------------
| x |   |   | 
-------------
|   | x |   | 
-------------
|   |   | x | 


# How to implement in a JAVA Program -

In code we will ask each player to enter a row no and col no so we can place 'x' or 'o' in it.
By default we make some assumptions that player x plays first and player y plays second.
 player 1 enters his row and column no to fill in 'x' and then we will move to player 2 and ask him to enter his row and column number to fill with 'o'. This will the game with move on till all the values are filled and a winner is declared.
 A tie is also possible - To check check if the game was a tie - We first check if board was full and there was no winner.
 
<blockquote class="imgur-embed-pub" lang="en" data-id="a/lujWc"><a href="//imgur.com/lujWc"></a></blockquote><script async src="//s.imgur.com/min/embed.js" charset="utf-8"></script>
