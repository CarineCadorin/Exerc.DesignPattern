package exercicio01;

public class DataAdapter extends DataLocal {
    private DataExterna dataExterna;

    public DataAdapter(DataExterna dataExterna) {
        super(convertToLocalFormat(dataExterna.getDataFormatoExterno()));
        this.dataExterna = dataExterna;
    }

    private static String convertToLocalFormat(String dataExterna) {
        String[] partes = dataExterna.split("-");
        return partes[2] + "/" + partes[1] + "/" + partes[0];
    }
}
