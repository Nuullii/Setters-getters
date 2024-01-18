public class Ordenador {
    private String CPU;
    private String GPU;
    private int ROM;

    public Ordenador(String valorCPU, String valorGPU, int valorROM) {
        CPU = valorCPU;
        GPU =valorGPU;
        ROM =valorROM;
    }
    public Ordenador(){

    }
    public String CPU(){
        return CPU();
    }
    public int ROM(){
        return ROM();
    }
}


