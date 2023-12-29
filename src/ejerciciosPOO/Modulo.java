package ejerciciosPOO;

public class Modulo {
    private String nombre;
    private String codigo;
    private int num_curso;
    private int num_horas;
    public Modulo(String nombre, String codigo, int num_curso, int num_horas){
        this.nombre = nombre;
        this.codigo = codigo;
        this.num_curso = num_curso;
        this.num_horas = num_horas;
    }
    public Modulo(){}

    public void set_info(String nombre, String codigo, int num_curso, int num_horas){
        this.nombre = nombre;
        this.codigo = codigo;
        this.num_curso = num_curso;
        this.num_horas = num_horas;
    }
    public void get_info(){
        System.out.println("El nombre del curso es "+this.nombre+", su códgio es "+this.codigo+", el número del curso es "+num_curso+" y el número de horas es "+num_horas);
    }
}
