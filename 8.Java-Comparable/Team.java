import java.util.Collections;
import java.util.List;

public class Team implements Comparable<Team> {
	private String name;
	private List<Player> ls;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getLs() {
		Collections.sort(ls);
		return ls;
	}
	public void setLs(List<Player> ls) {
		this.ls = ls;
	}
	public Team(String name) {
		super();
		this.name = name;
	}
	public void addPlayer(String name)
	{
		ls.add(new Player(name));
	}
	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}
	
}
