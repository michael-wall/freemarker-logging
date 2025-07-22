package com.mw.freemarker.logger;

import com.liferay.portal.kernel.template.TemplateContextContributor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

@Component(
	    immediate = true,
	    property = {"type=" + TemplateContextContributor.TYPE_GLOBAL},
	    service = TemplateContextContributor.class
	)
public class MWTemplateContextContributor implements TemplateContextContributor {

    @Override
    public void prepare(
        Map<String, Object> contextObjects,
        HttpServletRequest httpServletRequest) {

        contextObjects.put("freeMarkerTemplateLogger", new FreeMarkerTemplateLogger());
    }
}