package codingedge.connect4.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import codingedge.connect4.logic.Board;
import codingedge.connect4.logic.Game;

public class BoardPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	Game game;
	Board board;
	int playerOne, playerTwo;

	static final int CIRCLE_DISTANCE = 45;
	static final int CIRCLE_RADIUS = 35;

	JFrame frame;
	
	public BoardPanel() {

	}

	public BoardPanel(Game g) {
		this.game = g;
		this.board = g.getBoard();
		this.playerOne = Game.PLAYER_ONE_INT;
		this.playerTwo = Game.PLAYER_TWO_INT;
	}

	@Override
	public void paint(Graphics g) {
		int[][] boardArray = board.getBoardArray();

		Graphics2D g2d = (Graphics2D) g;
		for (int i = 0; i < board.getWidth(); i++) {
			int maxHeight = board.getHeight();
			for (int j = 0; j < maxHeight; j++) {
				if (boardArray[i][j] == playerOne) {
					g2d.setColor(Color.RED);
				} else if (boardArray[i][j] == playerTwo) {
					g2d.setColor(Color.BLACK);
				} else {
					g2d.setColor(Color.WHITE);
				}
				g2d.fillOval(i * CIRCLE_DISTANCE, (maxHeight - j)
						* CIRCLE_DISTANCE, CIRCLE_RADIUS, CIRCLE_RADIUS);
			}
		}
	}
}
