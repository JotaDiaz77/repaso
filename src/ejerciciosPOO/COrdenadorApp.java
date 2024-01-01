package ejerciciosPOO;

public class COrdenadorApp {
    public static void main(String[] args) {
        COrdenador c1 = new COrdenador("Toshiba","AMD","STN");


        c1.set_info("Ast","AMD","STN");
        c1.get_info();
        c1.set_estado(true);

        c1.encenderOrdenador();
        c1.estado();
    }
}
