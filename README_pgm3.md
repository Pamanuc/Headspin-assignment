# Headspin-assignment_03

Q3. Given a string containing n number of words. If the count of words in string is even then reverse 
    its even position words else reverse its odd position, push reversed words at the start of a new string 
    and append the remaining words as it is in order.

1.A string is accepted from the user.
2.The string is converted to a character array so as to separate the words.
3.A new array of same size is created to store the rearranged sentence.
4.The character array is processed from the end to the start.
5.The last word is always reversed and pushed to the beginning of the new array and subsequent words are
   separated with the help of spaces and pushed to the end, alternately.This is done using nested for-loops.
6.The rearranged string is then displayed.   