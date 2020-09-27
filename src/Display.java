import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;

public class Display extends Application
{
  @Override
  public void start(Stage primaryStage)
  {
    Pane pane = new Pane();
    Scene scene = new Scene(pane, 800, 800);

    Text title = new Text("Recette");
    TextField searchBar = new TextField();
    Button searchBtn = new Button("Search");
    Button addNewRecipeBtn = new Button("Add New Recipe");

    VBox checkboxes = new VBox();
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

    checkboxes.getChildren().addAll(checkboxItalian, checkboxThai, checkboxIndian, checkboxChinese, checkboxViet,
    checkboxKorean, checkboxJapan, checkboxMexican, checkboxGreek, checkboxFrench, checkboxBfast, checkboxLunch,
    checkboxDinner, checkboxDessert, checkboxGF, checkboxVege);

    title.relocate(20, 20);
    searchBar.relocate(150, 20);
    searchBtn.relocate(350, 20);
    addNewRecipeBtn.relocate(370, 20);

    checkboxItalian.relocate(50, 50);

    pane.getChildren().addAll(title, searchBar, searchBtn,addNewRecipeBtn, checkboxes);

    primaryStage.setScene(scene);
    primaryStage.setTitle("Recette: Recipe Manager");
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
      this.checkbox = new Button("  ");
      this.checkbox.setMinHeight(8);
      this.checkbox.setMinWidth(8);
      this.checkbox.setStyle((!value) ? "-fx-background-color: 'white'" : "-fx-background-color: 'black'");
      this.checkbox.setOnAction(e->{this.value = !this.value;
              this.checkbox.setStyle((!value) ? "-fx-background-color: 'white'" : "-fx-background-color: 'black'");});
      this.title.relocate(40, 0);
      getChildren().addAll(this.title, this.checkbox);
    }
  }

}
