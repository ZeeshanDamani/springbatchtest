package com.registration.batch.vehicle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.listener.ItemListenerSupport;

/**
 * Created by Zeeshan Damani
 */
public class VehicleItemFailureLoggerListener  extends ItemListenerSupport {


    private static Log logger = LogFactory.getLog("item.error");

    public void onReadError(Exception ex) {
        logger.error("Encountered error on read", ex    );
    }

    public void onWriteError(Exception ex, Object item) {
        logger.error("Encountered error on write", ex);
    }
}
