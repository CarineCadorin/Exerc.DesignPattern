package SistemaRelatorio;

public abstract class principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        String[] dados = {"Vendas: 100", "Lucro: 2000", "Despesas: 1500"};

        Relatorio pdfRelatorio = new PdfRelatorio();
        Relatorio excelRelatorio = new ExcelRelatorio();
        Relatorio htmlRelatorio = new HtmlRelatorio();

        gerente.solicitarRelatorio(pdfRelatorio, dados);
        gerente.solicitarRelatorio(excelRelatorio, dados);
        gerente.solicitarRelatorio(htmlRelatorio, dados);
    }
}
