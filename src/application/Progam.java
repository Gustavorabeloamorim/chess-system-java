package application;
import javax.swing.*;
import chess.ChessMatch;

@SuppressWarnings("unused")
public class Progam {

	public static void main(String[] args) {

		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());

	}

}
