package CalcFormasGeometricas;

public class principal {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(156, 2);
        retangulo.exibirDetalhes();

        Circulo circulo = new Circulo(8);
        circulo.exibirDetalhes();
    }
}
