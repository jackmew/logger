/**
 * 
 */
package tw.com.codedata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author jackho
 *
 */
public class App02 {
	
	private static Logger LOG = LoggerFactory.getLogger(App02.class);
	
	public static void main(String args[]) {
		LOG.debug("logger for App02");
		LOG.info("logger for App02");
		LOG.warn("logger for App02");
		LOG.error("logger for App02");
	}
}
