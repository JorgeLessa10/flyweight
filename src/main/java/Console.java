/*
 ** created by: jorge.lessa
 */
public class Console {

    private String nome;
    private String modelo;

    public Console() {
    }

    public Console(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
