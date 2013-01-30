package org.openmrs.module.xformshelper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.Activator;

/**
 * Activator startup/shutdown methods for the Xforms Helper module
 *
 * @author  Samuel Mbugua
 */
public class XformsHelperActivator implements Activator {

	private Log log = LogFactory.getLog(this.getClass());
	
	/**
	 * @see org.openmrs.module.Activator#startup()
	 */
	public void startup() {
		log.info("Starting the Xforms Helper module");
	}
	
	/**
	 *  @see org.openmrs.module.Activator#shutdown()
	 */
	public void shutdown() {
		log.info("Shutting down the Xforms Helper module");
	}
	
}
