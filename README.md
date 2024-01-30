# Hangman Game with Java Swing

This Java program implements a console-based hangman game. The game prompts the player to guess a word by selecting letters. The objective is to correctly guess all the letters in the word while avoiding running out of lives. The program utilizes basic Java console input/output for interaction.

## Instructions

1. Run the program using a Java development environment or terminal.
2. The game will randomly select a word from a predefined dictionary.
3. Enter letters to guess the word. Incorrect guesses will decrease the remaining lives.
4. The game provides visual feedback on incorrect guesses through a simple hangman drawing.
5. Win the game by correctly guessing all letters or lose by running out of lives.

## Components:

- String kelime;: Variable to store the randomly chosen word.
- String kelime2 = "";: Variable to store the current state of correctly guessed letters.
- int can = 7;: Variable representing the number of lives.
- char harf;: Variable to store the user's selected letter.
- boolean oyunAktif = true;: Variable controlling the game's active state.

## Initialization:

The oyunaBasla() method initializes the game, selecting a random word and setting up the initial display.

## Word Selection:

The kelimeBelirle() method randomly selects a word from a predefined dictionary.

## Letter Selection:

The harfSecildi(String kelime, char harf) method processes the user's letter selection, updating the game state accordingly.

## Result States:

The kazandin() and kaybettin() methods handle the end-game scenarios, displaying the outcome and terminating the game.

## Graphics Drawing:

The adamCiz() method provides a simple hangman drawing based on incorrect guesses.

## Usage Notes:

This program is designed for console-based interaction.
Ensure Java is installed on your system.
Run the program, follow on-screen instructions, and enjoy playing the hangman game.

## Screenshots

Check out the Hangman Game gameplay:


| ![1](https://github.com/beyzayildizli/AdamAsmaca/assets/77398074/ba07a385-ebbd-4ff6-9184-ab87b564b0a1) | ![2](https://github.com/beyzayildizli/AdamAsmaca/assets/77398074/5d9ec696-2149-4199-92ba-ba15713bd302) |
|---|---|
| ![3](https://github.com/beyzayildizli/AdamAsmaca/assets/77398074/50540c17-de47-48a5-b5a2-7ec42cca0ada) | ![4](https://github.com/beyzayildizli/AdamAsmaca/assets/77398074/b17fdff8-0e67-4057-8e07-4be64ec0bbc4) |
|---|---| 
| ![5](https://github.com/beyzayildizli/AdamAsmaca/assets/77398074/0bd8c341-6916-4ed9-bf27-ab786d594cf6) | ![6](https://github.com/beyzayildizli/AdamAsmaca/assets/77398074/03cd2d66-4148-4469-9c7a-6ed36e8cba0d) |

## Credits

This project was developed by Beyza Yıldızlı.
You can find me on [LinkedIn](https://www.linkedin.com/in/beyzayildizli/) or [GitHub](https://github.com/beyzayildizli)
