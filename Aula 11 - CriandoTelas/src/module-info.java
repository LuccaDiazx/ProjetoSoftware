module CriandoTelas {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.graphics;
	
	exports controller;
	opens controller to javafx.fxml;
	
	exports application;
	opens application to javafx.graphics, javafx.fxml;
}
