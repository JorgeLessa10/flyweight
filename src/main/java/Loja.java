import java.util.ArrayList;
import java.util.List;
/*
 ** created by: jorge.lessa
 */
public class Loja {

    private List<Jogo> jogoList = new ArrayList<>();

    public void addJogo(String nomeJogo, String nomeConsole, String modeloConsole)
    {
        Console console = ConsoleFactory.getConsole(nomeConsole, modeloConsole);
        Jogo jogo = new Jogo(nomeJogo, console);
        jogoList.add(jogo);
    }

    public List<String> obterJogos()
    {
        List<String> jogos = new ArrayList<>();
        for (Jogo jogo : jogoList)
        {
            jogos.add(jogo.obterJogo());
        }
        return jogos;
    }

}
