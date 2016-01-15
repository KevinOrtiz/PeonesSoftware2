package sismpleTestGame.cli;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;
import simpleGame.core.Board;
import simpleGame.core.Direction;
import simpleGame.core.Game;
import simpleGame.core.Pawn;
import simpleGame.exception.OutOfBoardException;;

public class testCLIMain {
	Direction d ;
	Board board = new Board(2,5,5,1,1);
	Pawn pawn = new Pawn('#',2,2,board);
	Pawn pawnEnemy = new Pawn('c',1,2,board);
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void TestGame() throws OutOfBoardException {
		Assert.assertEquals(null,board.getSquareContent(3, 2));
		Assert.assertEquals(null,board.getSquareContent(2, 2));
		Assert.assertEquals(true,board.isBonusSquare(1, 1));
		Assert.assertEquals(2, board.numberOfPawns());
		Assert.assertEquals('.',board.squareContentSprite(1, 2));	
		Assert.assertEquals(false,board.isBonusSquare(1, 2));
		Assert.assertEquals(0, board.maxGold());
		
		
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void TestGamePawn() throws OutOfBoardException {
		Assert.assertEquals("",pawn.move(d.Up));
		Assert.assertEquals("",pawn.move(d.Down));
		
		
		
	}
	
}
