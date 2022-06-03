
package print_a4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.JobSettings;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.layout.AnchorPane;

public class SecondController implements Initializable {

     @FXML
    private AnchorPane root3;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        printA4Paper();
    }   
    
    public void printA4Paper(){
          PrinterJob job = PrinterJob.createPrinterJob();
        Printer printer = Printer.getDefaultPrinter().getDefaultPrinter();
        PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.PORTRAIT, Printer.MarginType.DEFAULT);
        JobSettings jobSettings = job.getJobSettings();
        jobSettings.setPageLayout(pageLayout);
        boolean printed = job.printPage(root3);
        if (printed) {
            job.endJob();
        }
    }
    
}
