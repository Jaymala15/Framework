package com.utility;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import java.util.List;

public class ExtetReportListner implements IReporter {

    private ExtentReports extent;

    @Override
    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {

    }
}
