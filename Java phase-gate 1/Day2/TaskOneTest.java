import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TaskOneTest{
@Test
	public void testToCheckFatherSonAgeDifference() {
		int fatherAge = 40;
		int sonAge = 18;
	TaskOne ageCheck = new TaskOne();
	int result = ageCheck.checkAgeDifference(fatherAge,sonAge);
		assertEquals(result, 4);
	}
	}
