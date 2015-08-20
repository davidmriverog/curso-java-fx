package application;
	

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * Clase 4 - Bosquejo de una GUI
 * 
 * @author LellyDavid
 *
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// creamos los campos de textos
			TextField campo1 = new TextField();
			TextField campo2 = new TextField();
			TextField campo3 = new TextField();
			TextField campo4 = new TextField();
			TextField campo5 = new TextField();
			
			// creamos el panel donde contendran los campos
			VBox panelTexto = new VBox(5);
			panelTexto.getChildren().addAll(campo1,campo2,campo3,campo4,campo5);
			
			// creamos los buttons
			Button btn1 = new Button("Si");
			Button btn2 = new Button("No");
			Button btn3 = new Button("Cancelar");
			
			// creamos el panel donde contendran los buttons
			VBox panelBtn = new VBox(10);
			panelBtn.setAlignment(Pos.CENTER);
			
			panelBtn.getChildren().addAll(btn1,btn2,btn3);
			
			// Creamos el panel donde anidadaran los dos primeros paneles.
			HBox panelTextBtn = new HBox();
			panelTextBtn.setAlignment(Pos.CENTER);
			panelTextBtn.getChildren().addAll(panelBtn,panelTexto);
			
			// creamos el objeto tipo rectangulo en el menu
			Rectangle rectangulo1 = new Rectangle(40,40,Color.AZURE);
			Rectangle rectangulo2 = new Rectangle(40,40,Color.BEIGE);
			Rectangle rectangulo3 = new Rectangle(40,40,Color.CHOCOLATE);
			Rectangle rectangulo4 = new Rectangle(40,40,Color.BROWN);
			Rectangle rectangulo5 = new Rectangle(40,40,Color.DARKGRAY);
			
			// redondeos en los rectangulos
			rectangulo1.setArcWidth(15);
			rectangulo1.setArcHeight(15);
			
			rectangulo2.setArcWidth(15);
			rectangulo2.setArcHeight(15);
			
			rectangulo3.setArcWidth(15);
			rectangulo3.setArcHeight(15);
			
			rectangulo4.setArcWidth(15);
			rectangulo4.setArcHeight(15);
			
			rectangulo5.setArcWidth(15);
			rectangulo5.setArcHeight(15);
			
			// creamos el contenedor donde se alojaran los rectangulos
			HBox panelRect = new HBox(15);
			panelRect.setAlignment(Pos.CENTER);
			
			panelRect.getChildren().addAll(rectangulo1,rectangulo2,rectangulo3,rectangulo4,rectangulo5);
			
			// titulos y pie
			Text titleLayout = new Text("Layout Anidados");
			Text footer = new Text("Realizado por David Rivero");
			
			// contenedor general vertical
			VBox panelMain = new VBox();
			panelMain.getChildren().addAll(
			  titleLayout,
			  panelRect,
			  panelTextBtn,
			  footer
			);
			
			// Alineacion del panel
			panelMain.setAlignment(Pos.CENTER);
			
			// Margebes en el borde 
			panelMain.setPadding(new Insets(15,15,15,15));
			
			// panel general
			StackPane panelGeneral = new StackPane();
			panelGeneral.getChildren().add(panelMain);
			
			
			// inicalizador del componente
			Scene display = new Scene(panelGeneral,400,400);
			
			// parametros de la ventana
			primaryStage.setTitle("Manejo de Layout");
			primaryStage.setScene(display);
			
			// init App.
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
