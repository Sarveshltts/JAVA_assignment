
public class Player implements Comparable<Player> {
	private String pname;

	public Player(String pname) {
		super();
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "--" + pname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return pname.compareTo(o.getPname());
	}

}
