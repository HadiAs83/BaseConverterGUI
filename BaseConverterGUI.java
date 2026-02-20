import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class BaseConverterGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("تبدیل مبنا");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);

        Label numberLabel = new Label("عدد:");
        TextField numberField = new TextField();
        numberField.setAlignment(Pos.CENTER_RIGHT);
        grid.add(numberLabel, 0, 0);
        grid.add(numberField, 1, 0);

        Label baseInLabel = new Label("مبنای ورودی:");
        ComboBox<Integer> baseInCombo = new ComboBox<>();
        IntStream.rangeClosed(2, 16).forEach(baseInCombo.getItems()::add);
        baseInCombo.setValue(10);
        grid.add(baseInLabel, 0, 1);
        grid.add(baseInCombo, 1, 1);

        Label baseOutLabel = new Label("مبنای خروجی:");
        ComboBox<Integer> baseOutCombo = new ComboBox<>();
        IntStream.rangeClosed(2, 16).forEach(baseOutCombo.getItems()::add);
        baseOutCombo.setValue(2);
        grid.add(baseOutLabel, 0, 2);
        grid.add(baseOutCombo, 1, 2);

        Button convertButton = new Button("تبدیل");
        convertButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        grid.add(convertButton, 1, 3);

        Label resultLabel = new Label("نتیجه:");
        TextField resultField = new TextField();
        resultField.setEditable(false);
        resultField.setAlignment(Pos.CENTER_RIGHT);
        resultField.setStyle("-fx-background-color: #f0f0f0;");
        grid.add(resultLabel, 0, 4);
        grid.add(resultField, 1, 4);

        Label rulesLabel = new Label(
                "قوانین:\n" +
                "- پشتیبانی از اعداد منفی\n" +
                "- مبنا بین 2 تا 16\n" +
                "- حروف بزرگ و کوچک معتبر (A-F / a-f)\n" +
                "- انتخاب مبنا از منوی کشویی"
        );
        rulesLabel.setTextFill(Color.DARKBLUE);
        rulesLabel.setStyle("-fx-font-size: 12px; -fx-font-weight: bold;");
        rulesLabel.setWrapText(true);
        grid.add(rulesLabel, 0, 5, 2, 1);

        convertButton.setOnAction(e -> {
            try {
                String number = numberField.getText().trim();
                if (number.isEmpty())
                    throw new IllegalArgumentException("عدد وارد نشده است");
                int baseIn = baseInCombo.getValue();
                int baseOut = baseOutCombo.getValue();
                BigInteger decimalValue = toDecimal(number, baseIn);
                String result = fromDecimal(decimalValue, baseOut);
                resultField.setText(result);
            } catch (IllegalArgumentException ex) {
                resultField.setText("خطا: " + ex.getMessage());
            } catch (Exception ex) {
                resultField.setText("خطای غیرمنتظره رخ داد");
            }
        });

        Scene scene = new Scene(grid, 480, 330);
        scene.setFill(Color.LIGHTYELLOW);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static BigInteger toDecimal(String number, int base) {
        boolean isNegative = number.startsWith("-");
        if (isNegative) number = number.substring(1);

        if (number.isEmpty())
            throw new IllegalArgumentException("عدد نامعتبر است");

        number = number.toUpperCase();
        BigInteger result = BigInteger.ZERO;
        BigInteger bigBase = BigInteger.valueOf(base);

        for (char c : number.toCharArray()) {
            int digit = Character.digit(c, base);
            if (digit == -1)
                throw new IllegalArgumentException(
                        "رقم '" + c + "' برای مبنای " + base + " معتبر نیست");

            result = result.multiply(bigBase).add(BigInteger.valueOf(digit));
        }

        return isNegative ? result.negate() : result;
    }

    public static String fromDecimal(BigInteger number, int base) {
        return number.toString(base).toUpperCase();
    }
}