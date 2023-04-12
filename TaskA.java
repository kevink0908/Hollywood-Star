// Name: Kevin Kim
// Course: CS 2450
// Project: Assignment 3 TaskA
// Date: 4/9/2023
// Description: This program displays a star with the 
//				programmer's name displayed in the star.

package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class TaskA extends Application
{
	// set the width and height values for the scene.
	private final double SCENE_WIDTH = 640.0;
	private final double SCENE_HEIGHT = 480.0;
	// create a label for the programmer's name.
	private Label name = new Label("Kevin Kim");
	// create all the lines that are used to create a star.
	private Line line1;
	private Line line2;
	private Line line3;
	private Line line4;
	private Line line5;
	private Line line6;
	private Line line7;
	private Line line8;
	private Line line9;
	private Line line10;

	
    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)
    {
    	// Set the title for the stage.
    	primaryStage.setTitle("Assignment 3 Task A: Hollywood Star");
    	
    	// draw a star with with the programmer's name inside the star.
    	drawStar();

        // Create the scene and display it.
    	Pane pane = new Pane(name, line1, line2, line3, line4, line5, line6, line7, line8, line9, line10);
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    // this method draws a star and displays the programmer's name inside the star.
    public void drawStar()
    {
    	// draw all the lines in a star.
    	line1 = new Line(319, 20, 379, 219);
    	line2 = new Line(379, 219, 559, 219);
    	line3 = new Line(559, 219, 414, 319);
    	line4 = new Line(414, 319, 439, 460);
    	line5 = new Line(439, 460, 319, 379);
    	line6 = new Line(319, 379, 199, 460);
    	line7 = new Line(199, 460, 224, 319);
    	line8 = new Line(224, 319, 79, 219);
    	line9 = new Line(79, 219, 259, 219);
    	line10 = new Line(259, 219, 319, 20);
    	
    	// display the programmer's name inside the star.
    	name.setLayoutX(294);
    	name.setLayoutY(249);
    	name.setAlignment(Pos.CENTER);
    	
    }

}