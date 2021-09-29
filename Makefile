##
## EPITECH PROJECT, 2020
## makefile exe
## File description:
## fct
##

SRC = pong.jar

NAME = 101pong

all:
	mkdir class/
	javac -d ./class 101Pong/src/fr/twixer/OneZeroOnePong/Main.java 101Pong/src/fr/twixer/OneZeroOnePong/Builder/pong.java
	cp -r manifest.mf class/
	cd class/ && jar cmf manifest.mf pong.jar fr/twixer/OneZeroOnePong/Main.class fr/twixer/OneZeroOnePong/Builder/pong.class
	cp -r class/$(SRC) ./
	cp 101Pong.sh $(NAME)
	chmod 755 $(NAME)

clean:
	rm -r class/
	rm $(SRC)

fclean: clean
	rm $(NAME)

re:	fclean all
