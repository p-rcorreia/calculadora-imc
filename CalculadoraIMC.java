import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculadoraIMC extends Application {

    @Override
    public void start(Stage janela) {
        // Etiquetas para os campos de entrada de peso e altura
        Label pesoLabel = new Label("Peso (kg):");
        Label alturaLabel = new Label("Altura (m):");

        // Campos de texto para entrada de peso e altura
        TextField pesoField = new TextField();
        pesoField.setPromptText("Peso em kilogramas");

        TextField alturaField = new TextField();
        alturaField.setPromptText("Altura em metros");

        // Mostra o resultado do calculo do IMC
        Label resultadoLabel = new Label();

        // Botao para calcular o IMC
        Button calcularButton = new Button("Calcular IMC");
        calcularButton.setOnAction(e -> {
            try {
                double peso = Double.parseDouble(pesoField.getText().replace(",", "."));
                double altura = Double.parseDouble(alturaField.getText().replace(",", "."));

                double imc = peso / (altura * altura);
                resultadoLabel.setText(String.format("Seu IMC e: %.2f", imc));
            } catch (NumberFormatException exception) {
                resultadoLabel.setText("Por favor, insira valores numericos validos para peso e altura.");
            }
        });

        // Layout vertical
        VBox layout = new VBox(10, pesoLabel, pesoField, alturaLabel, alturaField, calcularButton, resultadoLabel);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        // Cena e palco
        Scene cena = new Scene(layout, 300, 250);
        janela.setTitle("Calculadora de IMC");
        janela.setScene(cena);
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
