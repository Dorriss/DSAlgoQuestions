import static org.junit.Test.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class TestTicTacToe {
  //@Ignore
	@Test
	public void test() {
		String[] players = {"Kanika","computer"};
		Game g = new  Game(2, 3);
		g.initGame(players);
	//	Assert.assertNotNull("");
		//assertNotNull("played", "");		
	}
	
  @Test
	public void test1() {
		String[] players = {"Kanika","computer1","computer2"};
		Game g = new  Game(3, 4);
		g.initGame(players);
	//	Assert.assertNotNull("");
		//assertNotNull("played", "");		
	}

}
