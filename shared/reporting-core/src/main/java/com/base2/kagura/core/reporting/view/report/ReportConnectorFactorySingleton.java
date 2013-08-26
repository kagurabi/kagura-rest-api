package com.base2.kagura.core.reporting.view.report;

import com.base2.kagura.core.reporting.view.report.configmodel.ReportConfig;
import com.base2.kagura.core.reporting.view.report.configmodel.ReportsConfig;
import com.base2.kagura.core.reporting.view.report.connectors.ReportConnector;

//import javax.inject.Inject;
//import javax.inject.Named;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: aubels
 * Date: 24/07/13
 * Time: 4:41 PM
 * To change this template use File | Settings | File Templates.
 */
//@Named
public class ReportConnectorFactorySingleton implements Serializable {

//    @Inject
//    @Config(value = "medimail.report.directory", defaultValue = "/opt/base2/medimail/releases/current/reportconfig/")
    java.lang.String report_directory;

    public ReportConnector getConnector(String name)
    {
        ReportsConfig reportsConfig = getReportsConfig();
        ReportConfig reportConfig = reportsConfig.getReports().get(name);
        if (reportConfig == null)
            return null;
        return reportConfig.getReportConnector();
    }

    public ReportsConfig getReportsConfig() {
        return ReportsConfig.getConfig(report_directory);
    }
}