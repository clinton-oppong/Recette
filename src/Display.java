import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;


public class Display extends Application
{
  @Override
  public void start(Stage primaryStage)
  {
    Pane mainPane = new Pane();
    Pane buttonPane = new Pane();
    Scene scene = new Scene(mainPane, 800, 900);

    Text title = new Text("Recette");
    TextField searchBar = new TextField();
    Button searchBtn = new Button("Search");
    Button addNewRecipeBtn = new Button("Add New Recipe");
    
    VBox prefButtons = new VBox(10);
    Button buttonItalian = new Button("Italian");
    Button buttonThai = new Button("Thai");
    Button buttonIndian = new Button("Indian");
    Button buttonChinese = new Button("Chinese");
    Button buttonViet = new Button("Vietnamese");
    Button buttonKorean = new Button("Korean");
    Button buttonJapan = new Button("Japanese");
    Button buttonMexican = new Button("Mexican");
    Button buttonGreek = new Button("Greek");
    Button buttonFrench = new Button("French");
    
    Button buttonBfast = new Button("Breakfast");
    Button buttonLunch = new Button("Lunch");
    Button buttonDinner = new Button("Dinner");
    Button buttonDessert = new Button("Dessert");
    Button buttonGF = new Button("Gluten-Free");
    Button buttonVege = new Button("Vegetarian");
    
    VBox checkboxes = new VBox(6);
    Text filter = new Text("Search by filter:");
    Checkbox checkboxItalian = new Checkbox("Italian", false);
    Checkbox checkboxThai = new Checkbox("Thai", false);
    Checkbox checkboxIndian = new Checkbox("Indian", false);
    Checkbox checkboxChinese = new Checkbox("Chinese", false);
    Checkbox checkboxViet = new Checkbox("Vietnamese", false);
    Checkbox checkboxKorean = new Checkbox("Korean", false);
    Checkbox checkboxJapan = new Checkbox("Japanese", false);
    Checkbox checkboxMexican = new Checkbox("Mexican", false);
    Checkbox checkboxGreek = new Checkbox("Greek", false);
    Checkbox checkboxFrench = new Checkbox("French", false);

    Checkbox checkboxBfast = new Checkbox("Breakfast", false);
    Checkbox checkboxLunch = new Checkbox("Lunch", false);
    Checkbox checkboxDinner = new Checkbox("Dinner", false);
    Checkbox checkboxDessert = new Checkbox("Dessert", false);
    Checkbox checkboxGF = new Checkbox("Gluten-Free", false);
    Checkbox checkboxVege = new Checkbox("Vegetarian", false);

    checkboxes.relocate(600, 20);
    
    checkboxes.getChildren().addAll(filter, checkboxItalian, checkboxThai, checkboxIndian, checkboxChinese, checkboxViet,
    checkboxKorean, checkboxJapan, checkboxMexican, checkboxGreek, checkboxFrench, checkboxBfast, checkboxLunch,
    checkboxDinner, checkboxDessert, checkboxGF, checkboxVege);
    
    prefButtons.getChildren().addAll(buttonItalian, buttonThai, buttonIndian, buttonChinese, buttonViet, buttonKorean,
    buttonJapan, buttonMexican, buttonGreek, buttonFrench, buttonBfast, buttonLunch, buttonDinner, buttonDessert, buttonGF,
    buttonVege);

    title.relocate(20, 20);
    searchBar.relocate(150, 20);
    searchBtn.relocate(350, 20);
    addNewRecipeBtn.relocate(370, 20);

    buttonPane.getChildren().addAll(prefButtons);
    mainPane.getChildren().addAll(title, searchBar, searchBtn,addNewRecipeBtn, checkboxes, buttonPane, new BigButton("Italian"));

    primaryStage.setScene(scene);
    primaryStage.setTitle("Recette: Recipe Manager");
    primaryStage.setResizable(false);
    primaryStage.show();
  }

  public static void main(String[] args)
  {
    launch(args);
  }

  class Checkbox extends Pane
  {
    Text title;
    boolean value;
    Button checkbox;

    public Checkbox(String title, boolean init)
    {
      this.title = new Text(title);
      this.value = init;
      this.title.setStyle("-fx-font-size: 15");
      this.checkbox = new Button("  ");
      this.checkbox.setMaxHeight(10);
      this.checkbox.setMaxWidth(10);
      this.checkbox.setMinHeight(10);
      this.checkbox.setMinWidth(10);
      this.checkbox.setStyle((!value) ? "-fx-background-color: 'white'" : "-fx-background-color: 'black'");
      this.checkbox.setOnAction(e->{this.value = !this.value;
              this.checkbox.setStyle((!value) ? "-fx-background-color: 'white'" : "-fx-background-color: 'black'");});
      this.title.relocate(40, 0);
      getChildren().addAll(this.title, this.checkbox);
    }
  }
  
  class BigButton extends Pane
  {
	  Text btnName; 
	  Image picPath; 
	  ImageView picShower; 
	  
	  public BigButton(String btnName)
	  {
		  this.btnName = new Text(btnName);
		  this.btnName.relocate(50, 50);
		  picPath = new Image(grabRandImage(btnName));
		  picShower = new ImageView(picPath);
		  this.getChildren().addAll(picShower, this.btnName);
	  }
	  
  }
  
  static String grabRandImage(String directoryName)
  {  
      File f = new File("src\\res\\" + directoryName);
      String[] pathnames = f.list();
      System.out.println("\\" + f.toString() + "\\" + pathnames[(int) (Math.random()*(pathnames.length))]);
	  return "res\\"+ directoryName + "\\" + pathnames[(int) (Math.random()*(pathnames.length))];
  }

}
