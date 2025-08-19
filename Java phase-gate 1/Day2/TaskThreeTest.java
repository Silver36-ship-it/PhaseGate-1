import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TaskThreeTest{
@Test
	public void testToCheckHowManyLikes() {
		String[] names = {"Paul","David"};
		TaskThree namesLiked = new TaskThree();
	String result = namesLiked.displayNamesThatLikesThis(names);
		assertEquals(result,"Paul and David likes this");
		}
		}
