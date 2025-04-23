package exercicio01;

public class Principal {
    public static void main(String[] args) {
        DataExterna dataExterna = new DataExterna("2025-04-23");
        DataLocal dataAdaptada = new DataAdapter(dataExterna);

        System.out.println("Data adaptada: " + dataAdaptada.getData());
    }
}