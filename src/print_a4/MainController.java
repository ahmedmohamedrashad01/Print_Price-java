package print_a4;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.print.JobSettings;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.Printer;
import javafx.print.PrinterAttributes;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;
import javafx.scene.transform.Scale;

public class MainController implements Initializable {

    public static String itemNameArab = "";
    public static String itemDesArab = "";
    public static String itemName = "";
    public static String itemDes = "";
    public static String oldPrice = "";
    public static String oldPricePoint = "";

    public static String newPrice = "";
    public static String newPricePoint = "";
    public static String color = "";

    @FXML
    private AnchorPane root;

    @FXML
    private AnchorPane rootBackGround;
    
    @FXML
    private AnchorPane rootHeader;

    @FXML
    private AnchorPane root2;

    @FXML
    private Button btn;

    @FXML
    private Label lblItemArabic;

    @FXML
    private Label lblDesArabic;

    @FXML
    private Label lblItemNameEn;

    @FXML
    private Label lblItemDesEn;

    @FXML
    private Label txtOldrcBg;

    @FXML
    private Label txtOldrcSll;

    @FXML
    private Label lblNewPrice;

    @FXML
    private Label lblNewPricePoint;

    @FXML
    void btnAction(ActionEvent event) throws IOException {

        try {
            printNode(root2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*
              btn.setVisible(false);
              lblItem.setText("احمد رشاد");
              PrinterJob job = PrinterJob.createPrinterJob();
              Printer printer = Printer.getDefaultPrinter().getDefaultPrinter();
              PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.PORTRAIT, Printer.MarginType.EQUAL);
              JobSettings jobSettings = job.getJobSettings();
              jobSettings.setPageLayout(pageLayout);
              boolean printed = job.printPage(root);
              if (printed) {
              job.endJob();
              }
              
         */
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //   txt1.setStyle("-fx-text-inner-color: black;");
        // txt2.setStyle("-fx-text-inner-color: black;");
        //txt1.setAlignment(Pos.CENTER_RIGHT);
        //txt2.setTextAlignment(TextAlignment.RIGHT);

        lblItemArabic.setText(itemNameArab);
        lblDesArabic.setText(itemDesArab);
        lblItemNameEn.setText(itemName);
        lblItemDesEn.setText(itemDes);
        txtOldrcBg.setText(oldPrice);
        txtOldrcSll.setText(oldPricePoint);
        lblNewPrice.setText(newPrice);
        lblNewPricePoint.setText(newPricePoint);

        if (color.equalsIgnoreCase("white")) {
            rootBackGround.setStyle("-fx-background-color: #fff");
            rootHeader.setStyle("-fx-background-color: #fff");
            
        } else {
            rootBackGround.setStyle("-fx-background-color:  #FFF112");
            rootHeader.setStyle("-fx-background-color:  #FE0000");
        }
    }

    public void printNode(final Node node) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        btn.setVisible(false);

        //  lblItemArabic.setText("قهوه");
        //      lblItemArabic.setTextAlignment(TextAlignment.RIGHT);
        //  lblDesArabic.setText("قهوه عربيه");
        Printer printer = Printer.getDefaultPrinter();
        PageLayout pageLayout
                = printer.createPageLayout(Paper.A4, PageOrientation.PORTRAIT, Printer.MarginType.HARDWARE_MINIMUM);
        PrinterAttributes attr = printer.getPrinterAttributes();
        PrinterJob job = PrinterJob.createPrinterJob();
        double scaleX
                = pageLayout.getPrintableWidth() / node.getBoundsInParent().getWidth();
        double scaleY
                = pageLayout.getPrintableHeight() / node.getBoundsInParent().getHeight();
        Scale scale = new Scale(scaleX, scaleY);
        node.getTransforms().add(scale);

        if (job != null && job.showPrintDialog(node.getScene().getWindow())) {
            boolean success = job.printPage(pageLayout, node);
            if (success) {
                job.endJob();

            }
        }
        node.getTransforms().remove(scale);

        try {
            Parent p = FXMLLoader.load(getClass().getResource("Select_Image.fxml"));
            root.getChildren().setAll(p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
