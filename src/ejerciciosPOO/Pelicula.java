package ejerciciosPOO;

public class Pelicula {
    private String titulo;
    private String director;
    private String genero;
    private double duracion;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setDirector(String director){
        this.director = director;
    }
    public String getDirector(){
        return this.director;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }

    public void setDuracion(double duracion){
        this.duracion = duracion;
    }
    public double getDuracion(){
        return duracion;
    }

    public void toTexto(){
        System.out.println("La película titulada "+this.titulo+" de género "+this.genero+" dirigida por "+this.director+" tiene una duración de "+this.duracion+" minutos");
    }
}
