package model.entities;

public class Veiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private int anoFabricacao;
    private int kmAtual;
    private int kmUltimaManut;
    private String dataUltimaManut;

    // Construtor
    public Veiculo(String marca, String modelo, String matricula, int anoFabricacao, int kmAtual, int kmUltimaManut, String dataUltimaManut) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anoFabricacao = anoFabricacao;
        this.kmAtual = kmAtual;
        this.kmUltimaManut = kmUltimaManut;
        this.dataUltimaManut = dataUltimaManut;
    }

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(int kmAtual) {
        this.kmAtual = kmAtual;
    }

    public int getKmUltimaManut() {
        return kmUltimaManut;
    }

    public void setKmUltimaManut(int kmUltimaManut) {
        this.kmUltimaManut = kmUltimaManut;
    }

    public String getDataUltimaManut() {
        return dataUltimaManut;
    }

    public void setDataUltimaManut(String dataUltimaManut) {
        this.dataUltimaManut = dataUltimaManut;
    }
}
