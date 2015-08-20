package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

/**
 * Ejemplo de un panel Horizontal con JavaFX.
 * 
 * 
 * @author David Rivero <davidmriverog@gmail.com>
 *
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// crear el stage Ventana principal marco de la app.
			
			// set title
			primaryStage.setTitle("Clase 3 - Layouts");
			
			Button btn1  = new Button("Sí");
			Button btn2  = new Button("No");
			Button btn3  = new Button("Cancelar");
			
			// panel horizontal
			HBox panelHorizontal = new HBox(20);
			
			// Autocentramos el panel H.
			panelHorizontal.setAlignment(Pos.CENTER);
			
			// Agregamos los botones al panel
			panelHorizontal.getChildren().addAll(btn1,btn2,btn3);
			
			// agregamos el panel horizontal a la capa principal (StackPane).
			StackPane canvas = new StackPane();			
			canvas.getChildren().add(panelHorizontal);
			
			// Contenedor del componente inicalizado.
			  // Scene(Node, width,height)
			Scene scene = new Scene(canvas,200,100);
			
			// Integramos la escena en la interfaz.
			primaryStage.setScene(scene);
			
			// Restringimos ajuste de ventana
			primaryStage.setResizable(false);
			
			
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
