public class Titik {
    private int x, y;

    public Titik() {
    }

    public void inisialisasiTitik(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void tampilTitik(){
        System.out.println("Titik : ( " + x + ", " + y + " )");
    }

    public void perkalianSkalar(int skalar){
        x = x * skalar;
        y = y * skalar;
        System.out.println("Titik x : " + x);
        System.out.println("Titik y : " + y);
    }

    public void pencerminanSumbuX(){
        y = -y;
        System.out.println("Titik y : " + y);
    }

    public void pencerminanSumbuY(){
        x = -x;
        System.out.println("Titik x : " + x);
    }

    public int jarak(Titik t2){
        int deltaX = t2.x - this.x;
        int deltaY = t2.y - this.y;
        return (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
