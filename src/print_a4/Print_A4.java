package print_a4;

import com.jfoenix.controls.JFXButton;
import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/**
 *
 * @author rashad
 */
public class Print_A4 extends Application {

  
    
    public static Stage myStage;
    
      @FXML
    void btnClick(ActionEvent event) {

    }
    
    

    @Override
    public void start(Stage primaryStage) {

       
        this.myStage = primaryStage;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Select_Image.fxml"));
            
           
             Scene scene = new Scene(root);
           //  scene.getStylesheets().add("Sheet.css");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
           // primaryStage.getScene().getStylesheets().add("Sheet.css");
              primaryStage.setTitle("A4 Paper APP {APA}");
               primaryStage.getIcons().add(new Image("print_a4/c.png"));
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
       
        
       
    }
    
    
    
    
    /*
    public static void printImageView(final ImageView imageView) {
    final PrinterJob job = PrinterJob.createPrinterJob();
    if (job != null) {
        // Get the default page layout
        final Printer printer = Printer.getDefaultPrinter();
        PageLayout pageLayout = job.getJobSettings().getPageLayout();
        // Request landscape orientation by default
        pageLayout = printer.createPageLayout(pageLayout.getPaper(), PageOrientation.PORTRAIT, Printer.MarginType.DEFAULT);
        job.getJobSettings().setPageLayout(pageLayout);
        
            pageLayout = job.getJobSettings().getPageLayout();
            // determine the scaling factor to fit the page
            final double scale = Math.min(pageLayout.getPrintableWidth() / imageView.getBoundsInParent().getWidth(), pageLayout.getPrintableHeight() / imageView.getBoundsInParent().getHeight());
            imageView.getTransforms().add(new Scale(scale, scale));
            if (job.printPage(imageView)) {
                job.endJob();
            }
         
    }
}
*/
    
    
    public static void main(String[] args) {
        launch(args);
    }

}
