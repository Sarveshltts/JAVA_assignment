

public class Wicket {
	@Override
	public String toString() {
		return "Wicket [playerName=" + playerName + "]";
	}


	private String playerName;
	//Bowler b=new Bowler();
//	public Bowler getB() {
//		return b;
//	}
//	public void setB(Bowler b) {
//		this.b = b;
//	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
	public Wicket(String playerName) {
		super();
		this.playerName = playerName;
		
	}
	
	
	public Wicket() {
		super();
	}

	

}
