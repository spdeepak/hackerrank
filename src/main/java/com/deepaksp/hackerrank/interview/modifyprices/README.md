Michael is a shop owner who keeps n list, *l*, of the name and sale price each itme in inventory. The Store employees record the name and sale price of each item sold. Michael suspects his manager, Alex, of embezzling money and modifying the sale prices of some of the items.

Complete the function so that it returns the number of incorrect sale prices recorded by Alex. It has *4* parameters.
1. <dl><dt>origItems</dt></dl> An array of Strings. where each element is an item name
2. <dl><dt>origPrices</dl></dt> An array of floating point numbers, where each element contains the original (correct) price of the item in the corresponding index of *origItems*
3. <dl><dt>items</dl></dt> An array of string containing the name of the items with sales recorded by Alex
4. <dl><dt>prices</dl></dt> An array of floating point numbers, where each element contains the sale price recorded by Alex for the item in the corresponding index of items.

**Sample Input 1**
String[] *origItems* = {"rice","sugar","wheat","cheese"};
float[] *origPrices* = {16.89F, 56.92F, 20.89F, 345.99F};
String[] *items* = {"rice","cheese"};
float[] *origPrices* = {15.99F, 400.79F};

**Sample Output 1**
2