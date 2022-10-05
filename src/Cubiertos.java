
class Cubiertos {
    private int numCubiertos;

    public Cubiertos(int numCubiertos) {
        this.numCubiertos = numCubiertos;
    }

    public int getNumCubiertos() {
        return numCubiertos;
    }

    public void setNumCubiertos(int numCubiertos) {
        this.numCubiertos = numCubiertos;
    }

    @Override
    public String toString() {
        return numCubiertos + " cubiertos ";
    }
}