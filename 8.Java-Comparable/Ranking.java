
public class Ranking implements Comparable<Ranking> {

		private String name;
		private int score;
		private int i;
		public Ranking(int i,String name, int score) {
			super();
			this.i=i;
			this.name = name;
			this.score = score;
		}
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public int compareTo(Ranking o) {
			// TODO Auto-generated method stub
			if(score==o.getScore())
			{
			return 0;
			}
			else if(score>o.getScore())
			{
				return 1;
			}
			else
				return -1;
		}
		@Override
		public String toString() {
			return  i+" name=" + name + " score=" + score ;
		}
		
		

	}


