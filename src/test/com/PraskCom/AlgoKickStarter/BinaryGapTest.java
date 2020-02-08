package test.com.PraskCom.AlgoKickStarter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.PrasKCom.AlgoKickStarter.BinaryGap;

public class BinaryGapTest {
	
	BinaryGap bg = new BinaryGap();
	
	@Test
	public void BinaryGap32() {
		assertEquals(5,bg.longestSequence1(32));
	}

	
	@Test
	public void BinaryGap15() {
		assertEquals(0,bg.longestSequence1(15));
	}
}
