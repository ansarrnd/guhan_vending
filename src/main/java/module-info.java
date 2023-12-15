module org.openjfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;
    opens org.openjfx to javafx.fxml, javafx.graphics;
    exports org.openjfx;
}