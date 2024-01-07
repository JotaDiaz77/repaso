package ejerciciosPOO;

public class PeliculaApp {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula();

        p1.setTitulo("Titanic");
        p1.setGenero("drama");
        p1.setDirector("Mike Wasosky");
        p1.setDuracion(1.4);

        p1.toTexto();

        p2.setTitulo("Transformers");
        p2.setDuracion(2);

        if (p1.getDuracion() > p2.getDuracion()){
            System.out.println("La película "+p1.getTitulo()+" dura más que la película "+p2.getTitulo());
        }else{
            System.out.println("La película "+p2.getTitulo()+" dura más que la película "+p1.getTitulo());
        }
    }
}
