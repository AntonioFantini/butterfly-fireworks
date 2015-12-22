package org.openxava.management.actions;

import java.util.*;

import javax.ejb.*;
import javax.inject.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.*;

import org.openxava.actions.*;
import org.openxava.controller.*;
import org.openxava.management.actions.objects.*;
import org.openxava.management.model.*;
import org.openxava.model.*;
import org.openxava.tab.*;
import org.openxava.util.*;

public class PrintDownloadSelectedAction extends JasperReportBaseAction {
	@Inject
	// Since v4m2, if you do not use <use-object />
	private Tab tab;
	private ModuleContext context;

	@Override
	protected JRDataSource getDataSource() throws Exception {
		return new JRBeanCollectionDataSource(getDownloadSelection());
	}

	@Override
	protected String getJRXML() throws Exception {
		//TODO MODELLO JRXML
		return null;
	}

	@Override
	protected Map getParameters() throws Exception {
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private List<DownloadSelection> getDownloadSelection() throws XavaException, SystemException, FinderException {
		Map[] selected = tab.getSelectedKeys();
		List<DownloadSelection> data = new ArrayList<DownloadSelection>();
		
		Map members = new HashMap<String, String>();
		members.put("downloadDate","downloadDate");
		members.put("uploadDate","uploadDate");
		Map bomb = new HashMap<String, String>();
		bomb.put("type", "type");
		bomb.put("weight", "weight");
		Map category = new HashMap<String, String>();
		category.put("categoryDescription", "categoryDescription");
		bomb.put("category", category);
		members.put("bomb", bomb);

		for (Map map : selected) {
			Map value = MapFacade.getValues(Store.class.getSimpleName(), map, members);
			data.add(new DownloadSelection(value));
		}
		return data;
	}

}
