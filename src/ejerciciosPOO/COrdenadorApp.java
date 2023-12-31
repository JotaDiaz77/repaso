package ejerciciosPOO;

public class COrdenadorApp {
    public static void main(String[] args) {
        COrdenador c1 = new COrdenador();

        c1.marca = "Ast";
        c1.procesador = "AMD";
        c1.pantalla = "TFT";
        c1.ordenadorEncendido = false;

        c1.apagarOrdenador();
        c1.estado();
    }
}
