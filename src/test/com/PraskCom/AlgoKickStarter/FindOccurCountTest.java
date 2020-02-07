/**
 * 
 */
package test.com.PraskCom.AlgoKickStarter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.PrasKCom.AlgoKickStarter.FindOccurCount;

/**
 * @author pkanvin
 *
 */
public class FindOccurCountTest {
	
	FindOccurCount myOccurCount = new FindOccurCount();
	
	
	@Test
	public void FindOccurCountTest() {
		
		
		assertEquals(1,myOccurCount.getOccurCount("Hello"));
		
	}
	

}
