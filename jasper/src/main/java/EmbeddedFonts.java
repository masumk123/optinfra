

import java.io.IOException;
import java.util.HashMap;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;


public class EmbeddedFonts {
	public static void main(String[] args) throws JRException, IOException {
		
	//	   JRProperties.setProperty("net.sf.jasperreports.default.pdf.font.name", "E:/report pb/backup/EmbeddedFonts/src/main/resources/fonts/arial-narrow.ttf");
		    JasperReport jasperReport = JasperCompileManager.compileReport("D:/output/report.jrxml");
		    
		    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,new HashMap(), new JREmptyDataSource());
		    
		    JasperExportManager.exportReportToPdfFile(jasperPrint, "sample.pdf");
		    JasperExportManager.exportReportToHtmlFile(jasperPrint, "sample2.html");
		    
		    System.out.println("---------end-------");
			         
	}
}
