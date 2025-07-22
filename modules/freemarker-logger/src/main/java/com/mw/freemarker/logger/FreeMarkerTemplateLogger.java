package com.mw.freemarker.logger;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class FreeMarkerTemplateLogger {
	
	
    public void info(String template, String message) {
        _log.info(template + ": " + message);
    }

    public void warn(String template, String message) {
        _log.warn(template + ": " + message);
    }

    public void error(String template, String message) {
        _log.error(template + ": " + message);
    }

    public void debug(String template, String message) {
        _log.debug(template + ": " + message);
    }
	
	private static final Log _log = LogFactoryUtil.getLog(FreeMarkerTemplateLogger.class);
}