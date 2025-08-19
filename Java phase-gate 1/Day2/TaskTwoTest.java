import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TaskTwoTest{
@Test
	public void testToCheckAverageScoreOfThree() {
		int firstScore = 80;
		int secondScore = 75;
		int thirdScore = 90;
	TaskTwo averageCheck = new TaskTwo();
	int result = averageCheck.checkAgeDifference(firstScore,secondScore,thirdScore);
		assertEquals(result,'B');
	}
	} 