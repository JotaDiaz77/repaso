package ejerciciosPOO;

public class COrdenador {
    String marca;
    String procesador;
    String pantalla;
    boolean ordenadorEncendido;

    void encenderOrdenador(){
        if (ordenadorEncendido){
            System.out.println("El ordenador ya está encendido");
        }else{
            ordenadorEncendido = true;
            System.out.println("El ordenador se está encendiendo");
        }
    }

    void apagarOrdenador(){
        if (!ordenadorEncendido){
            System.out.println("El ordenador ya está apagado");
        }else{
            ordenadorEncendido = false;
            System.out.println("El ordenador se está apagando");
        }
    }

    public void estado(){
        System.out.println("Datos del ordenador: " +
                "Marca -> " +this.marca
                +" | Procesador -> "+this.procesador
                +" | Pantalla -> "+this.pantalla);

        if (ordenadorEncendido){
            System.out.println("El ordenador está encendido");
        }else{
            System.out.println("El ordenador está apagado");
        }
    }

}
