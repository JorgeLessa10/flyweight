/*
 ** created by: jorge.lessa
 */

public class Jogo {

    private String nome;
    private Console console;

    public Jogo(String nome, Console console) {
        this.nome = nome;
        this.console = console;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    public String obterJogo() {
        return "Jogo{" +
                "nome='" + this.nome + '\'' +
                ", Nome do console=" + this.console.getNome() +
                ", Modelo do console=" + this.console.getModelo() +
                '}';
    }
}
