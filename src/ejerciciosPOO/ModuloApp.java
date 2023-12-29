package ejerciciosPOO;

public class ModuloApp {
    public static void main(String[] args) {
        Modulo md1 = new Modulo("Base de datos", "0484",1,160);
        Modulo md2 = new Modulo();

        md1.get_info();

        md2.set_info("Programación", "0485",1,192);
        md2.get_info();
    }
}
