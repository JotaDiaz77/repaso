package ejerciciosPOO;

public class Punto {
    private int x, y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void calculo(Punto OtroPunto){
        int suma;
        double raiz;

        suma = (int) (Math.pow((OtroPunto.x - this.x),2) + Math.pow((OtroPunto.y - this.y),2));

        raiz = Math.sqrt(suma);

        System.out.println("La distancia entre los puntos es de "+raiz);
    }
}
