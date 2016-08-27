import java.util.ArrayList;


public class Game {

	int numPlayers;
	int boarddimension;

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	public int getBoarddimension() {
		return boarddimension;
	}

	public void setBoarddimension(int boarddimension) {
		this.boarddimension = boarddimension;
	}

	public Game() {
		setNumPlayers(2);
		setBoarddimension(3);
	}

	public Game(int numPlayers, int boardDimension) {
		setNumPlayers(numPlayers);
		setBoarddimension(boardDimension);
	}

	public void initGame(String[] playernames) {
		
		ArrayList<Players> pl = new ArrayList<Players>();
		Board gameboard  = new Board(); 
		gameboard.setMat(getBoarddimension());
		for (int i = 0; i < getNumPlayers(); i++) {
			Players p = new Players();
			p.setPlayername(playernames[i]);
			pl.add(p);
		}	
		
		play(gameboard,pl);
	}
	
	public void play(Board gameboard, ArrayList<Players> pl){
		
		int i = 0;
		while(gameboard.checkforwin() != true)
		{
			if(i==pl.size())
				i=0;
			
			Turn t = pl.get(i).playturn(pl.get(i).Playername+"'s"+" "+ "turn" );
			boolean chance = gameboard.setcell(t.i, t.j);
			while(chance == false)
			{
				t = pl.get(i).playturn("wrong location play again\n" + pl.get(i).Playername+ " "+"turn" );
				chance = gameboard.setcell(t.i, t.j);
			}
				i++;
			if(gameboard.checkforwin() == true)
				{
				  System.out.println(pl.get(i-1).getPlayername() +" "+ "won" );
				  System.out.println("game over" );
				  return;
				}
			
		}
		
	}
	
	
	public static void main(String args[])
	{
		String[] players = {"Kanika","computer"};
		Game g = new  Game(2, 3);
		g.initGame(players);
		
	}

}
