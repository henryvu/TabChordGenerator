Tab Chord Generator
===================

This program takes an input text file with a list of guitar chords and displays them in sequential order in tab format.  The reason behind this program is I read music while playing off my netbook which doesn't have a lot of screen real estate.  By outputting all of the chords in sequential order I can maximize the amount of info I can display on the screen.

How-To
------

A string of chord letters can be entered into a text file.  Upper case letters are major chords and lower case letters are minor chords.  A text file with ABCDEFGabcdefg will output:


      A  B  C  D  E  F  G  Am Bm Cm Dm Em Fm Gm    
    -----------2-----1--3-----2--3--1-----1--3-----
    --2--4--1--3-----1-----1--3--4--3-----1--3-----
    --2--4-----2--1--2-----2--4--5--2-----1--3-----
    --2--4--2-----2--3-----2--4--5-----2--3--5-----
    -----2--3-----2-----2-----2--3-----2--3--5-----
    --------------------3-----2--x--x-----1--3-----


Version History
---------------

* **V1.1.0**  (9.16.13) Created a swing interface.  Save button is inactive, but all other components are functioning properly.
* **V1.0.2**  (9.15.13) Migrated project from eclipse to IntelliJ.  Also corrected swing output of the tab chords.
* **V1.0.1**  (9.13.13) Added a text parser to remove any illegal input.  Added a file selection window to specify any file on the computer.  Added swing output though formatting is borked.  Correctly formatted text still appears in console window.
* **V1.0.0**  (9.12.13) First version outputs in console and can handle major and minor chords

To-Do List
----------

* ~~Ability to modify chord progression in-program~~ and save back to txt file
* Add sharp and flat chords
* Add some sort of song database system.
