public class Ordenador {
    private String CPU;
    private String GPU;
    private int RAM;

    public Ordenador(String valorCPU, String valorGPU, int valorRAM) {
        CPU = valorCPU;
        GPU =valorGPU;
        RAM =valorRAM;
    }
    public Ordenador(){

    }
    public String CPU(){
        return CPU();
    }
    public int RAM(){
        return RAM();
    }
}


