module pbo.projectuas {
    requires javafx.controls;
    requires javafx.fxml;

    opens pbo.projectuas to javafx.fxml;
    exports pbo.projectuas;
}
