package edu.utn.frro.ma.ideal.moodystudent;
/* 5: Let’s Implement: Create a class that implements the Mood interface for each mood variation.
Alternative Step 5.a : One variation is a mix of other variations
 */
public class CompositeMood implements Mood {
	Mood[] moods;
	public CompositeMood(Mood... moods) {
		this.moods=moods;
	}
	public String speak() {
		StringBuffer sb = new StringBuffer();
		for	(Mood mood : moods) {
			sb.append(mood.speak());
		}
		return sb.toString();
	}

}
