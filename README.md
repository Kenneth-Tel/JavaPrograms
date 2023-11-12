# JavaPrograms
My Java Projects Collection

## 1. Table 
Table is a basic multiplication table Project
- Inputs: Length and Depth
- Output: Calculated Matrix multiplication table

#### 1.1 Program Rapport
It is currently very inefficient.
- When muliplying length & depth Array into the Matrix, the program does not remember what has been calculated. Example: Calculating 2x4 and 4x2 separately -> wastes resources. 


## 2. Gassuian Distribution
Plays Galton Board with an Array.
- Inputs: Any type of array.
- Output: An item inside that array, following normal distribution.

#### 2.1 Program Rapport
Pretty Much Done, but some code could be refactored for code readability. But it works.
The idea behind this, is that one is able to parse any Array into the playGaltonBoard method, then return a specific index, following normal distribution. --> Loot Table, most likely to drop bad loot, but sometimes good loot.

#### 2.2 Bugs.
Not exactly a bug, but more of a result of the idea behind the purpose of the code:
- Both the Standart Diviation and the Mean is controlled by the Array.
- - It is 'possible' to add a bias to the TranslatedBall, but that could throw a ArrayIndexOutOfBounds Exception. So further development could be implemented here.
    
#### 2.3 Additions Needed
- Bias on Ball chance.
- Console Code Seperation.
- Util class seperation.

#### Code "Documentation"
To find the chanceOfHitting
- Uses Pascal Triangle.
When Printing the GaltonBoard
- The chanceOfHitting is automatically formatted to be Out of 100 -> " x / 100 ", this calculation is done in the Util Class.
  

