<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="org.openxava.application.meta.MetaModule"%>
<%
	if ("true".equals(request.getParameter("bookmarkModules"))) {
		modulesList = modules.getBookmarkModules();
		bookmarkModules = true;
	} else {
		modulesList = new ArrayList<MetaModule>();
		List<MetaModule> allModules = modules.getAll();
		if (null != allModules)
			for (MetaModule module : allModules) {
				if (!"Role".equalsIgnoreCase(module.getLabel())
						&& !"Utente"
								.equalsIgnoreCase(module.getLabel())
						&& !"First steps".equalsIgnoreCase(module
								.getLabel())) {
					modulesList.add(module);
				}

			}

	}
%>