package de.mwvb.blockpuzzle.logic.spielstein

// Kotlin supports multi line strings
class GamePiecesDefinition {
    val gamePieces =
"""
// Jede Spielsteinart standardmäßig 4x dabei.
// Je nach Schwierigkeitsgrad wird das zum Teil abhängig von der Punktzahl variiert.

#1
n=3
.....
.....
..1..
.....
.....

#2
n=2
R=1
.....
.....
.11..
.....
.....
   
#3
n=2
R=2
.....
.....
.111.
.....
.....

#4
n=2
R=2
.....
.....
1111.
.....
.....

#4_Bonus
min=10000
.....
.....
1111.
.....
.....

#5
n=2
R=1
.....
.....
11111
.....
.....

#Ecke2
R=1
RR=1
L=1
.....
.....
..11.
..1..
.....

#Ecke3
R=1
RR=1
L=1
.....
.111.
.1...
.1...
.....

#Ecke3_Bonus
min=11000
.....
.111.
.1...
.1...
.....

#Ecke3_R_Bonus
min=25000
.....
.111.
...1.
...1.
.....

#J
min=1000
.....
.1...
.111.
.....
.....

#L
min=1000
.....
.....
.111.
.1...
.....

#2x2
.....
.11..
.11..
.....
.....

#2x2_Bonus
min=2000
.....
.11..
.11..
.....
.....

#2x3
min=2500
.....
.11..
.11..
.11..
.....

#2x3_R
min=3500
.....
.111.
.111.
.....
.....

#S
min=4000
.....
..11.
..1..
.11..
.....

#Z
min=4000
.....
.11..
..1..
..11.
.....

#3x3
.....
.111.
.111.
.111.
.....

#3x3_Bonus1
min=5000
.....
.111.
.111.
.111.
.....

#3x3_Bonus2
min=7000
.....
.111.
.111.
.111.
.....

#3x3_Bonus3
min=9000
.....
.111.
.111.
.111.
.....

#3x3_Bonus4
min=20000
.....
.111.
.111.
.111.
.....

#T
R=1
RR=1
L=1
min=8000
.....
.....
.111.
..1..
.....

"""

}