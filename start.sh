#!/bin/sh
#commande pour lancer Hex en cherchant les biblioth�ques dans le r�pertoire courrant.
cd obj/
java -Djava.library.path=.. Hex
