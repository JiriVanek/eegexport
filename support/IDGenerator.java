package support;
import java.math.BigInteger;
import java.security.SecureRandom;
/**
 * class for generating ID
 * @author Vanek
 * http://docs.oracle.com/javase/6/docs/api/java/security/SecureRandom.html
 *
 */
public final class IDGenerator {

	  private SecureRandom random = new SecureRandom();
/**
 * returns new ID
 * @return string of ID
 */
	  public String nextSessionId() {
	    return new BigInteger(130, random).toString(32);
	  }
	
}
