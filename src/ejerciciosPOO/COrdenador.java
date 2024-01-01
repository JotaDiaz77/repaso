package ejerciciosPOO;

public class COrdenador {
    private String marca;
    private String procesador;
    private String pantalla;
    private boolean ordenadorEncendido;

    public COrdenador(String marca, String procesador, String pantalla){
        this.marca = marca;
        this.procesador = procesador;
        this.pantalla = pantalla;
    }

    public void set_info(String marca, String procesador, String pantalla){
        this.marca = marca;
        this.procesador = procesador;
        this.pantalla = pantalla;
    }

    public void get_info(){
        System.out.println("Datos del ordenador:");
        System.out.println("Marca -> " +this.marca);
        System.out.println("Procesador -> "+this.procesador);
        System.out.println("Pantalla -> "+this.pantalla);
    }

    public boolean set_estado(boolean estado){
        this.ordenadorEncendido = estado;
        return this.ordenadorEncendido;
    }

    public void encenderOrdenador(){
        if (this.ordenadorEncendido){
            System.out.println("El ordenador ya está encendido");
        }else{
            this.ordenadorEncendido = true;
            System.out.println("El ordenador se está encendiendo");
        }
    }

    public void apagarOrdenador(){
        if (!this.ordenadorEncendido){
            System.out.println("El ordenador ya está apagado");
        }else{
            this.ordenadorEncendido = false;
            System.out.println("El ordenador se está apagando");
        }
    }

    public void estado(){
        if (ordenadorEncendido){
            System.out.println("El ordenador está encendido");
        }else{
            System.out.println("El ordenador está apagado");
        }
    }

}
