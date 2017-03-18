There are *n* citizens voting in this year's *Hackland election*. Each voter writes the name of their chosen candidate on a ballot and places it in a ballot box.
The candidate with the highes number of votes win the election;
if two or more candidates have the same number of votes, then the tied candidates' names are ordered alphabetically and the last name wins.

Complete the *election Winner* function in your editor. It has *1* parameter:L an array of strings, *votes*, describing the votes in the ballot box. This function must review these votes and return a string representing the name of the winning candidate.

**Constraints**

* 1<= n <= 10^4

**Input Format**
An array of Strings

**Output Format**
Name of the person who has the max votes. If there are multiple people with same number of votes(max) then print the last name.

**Sample Input  1**
String[] votes = { "victor", "veronica", "ryan", "dave", "maria", "farah", "farah", "ryan", "veronica" };

**Sample Output 1**
veronica