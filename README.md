## Introduction ##
- This is a sample OSGi to show how logging can be added in a FreeMarker template.

## Usage ##
- Build and deploy the freemarker-logger module.
- Define a simple Web Content Structure and Template.
- Add the following to the Web Content Template where the first argument (e.g. SVG Test) is the Template name to be prepended to the logging message, and the second argument is the message to be logged:
```
<#attempt>
    ${freeMarkerTemplateLogger.info("SVG Test", "This is some sample INFO logging from a FreeMarker template...")}
<#recover>
</#attempt>
```
- Create a Web Content Article using the Web Content Structure.
- Add the Web Content Article to a Liferay Page using the Web Content Display widget.
Visit the Page to trigger the template and Check the Liferay logs:
```
2025-07-22 15:26:50.494 INFO  [http-nio-8080-exec-8][FreeMarkerTemplateLogger:10] SVG Test: This is some sample INFO logging from a FreeMarker template...
```

## Limitations ##
- All logging uses 'FreeMarkerTemplateLogger' as the class, as that's the class that does the logging. Use the first argument to specify the FreeMarker Template instead.
- The line number from the logging is from 'FreeMarkerTemplateLogger' and will always be the same as the logging is triggered by the code in FreeMarkerTemplateLogger.

## Environment ##
- The module was built and tested with 2025.Q1.0 (Liferay Workspace gradle.properties > liferay.workspace.product = dxp-2025.q1.0-lts)
- JDK 21 is expected for compile time and runtime.

## Notes ##
- This is a ‘proof of concept’ that is being provided ‘as is’ without any support coverage or warranty.
