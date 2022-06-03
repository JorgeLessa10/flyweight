import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class LojaTest {

    @Test
    void deveRetornarJogos()
    {
        Loja loja = new Loja();
        loja.addJogo("FIFA", "PS4", "PS4 Pro");
        loja.addJogo("PES", "PS4", "PS4 Pro");
        loja.addJogo("F1", "PS4", "PS4 Pro");
        loja.addJogo("FIFA", "PS4", "PS4 Slim");
        loja.addJogo("PES", "PS4", "PS4 Slim");
        loja.addJogo("F1", "PS4", "PS4 Slim");

        loja.obterJogos();
        List<String> jogos = Arrays.asList(
                "Jogo{nome='FIFA', Nome do console=PS4, Modelo do console=PS4 Pro}",
                "Jogo{nome='PES', Nome do console=PS4, Modelo do console=PS4 Pro}",
                "Jogo{nome='F1', Nome do console=PS4, Modelo do console=PS4 Pro}",
                "Jogo{nome='FIFA', Nome do console=PS4, Modelo do console=PS4 Slim}",
                "Jogo{nome='PES', Nome do console=PS4, Modelo do console=PS4 Slim}",
                "Jogo{nome='F1', Nome do console=PS4, Modelo do console=PS4 Slim}");

        assertEquals(jogos, loja.obterJogos());
    }

    @Test
    void deveRetornarModelosDeConsoles()
    {
        Loja loja = new Loja();
        loja.addJogo("FIFA", "PS4", "PS4 Pro");
        loja.addJogo("PES", "PS4", "PS4 Pro");
        loja.addJogo("F1", "PS4", "PS4 Pro");
        loja.addJogo("FIFA", "PS4", "PS4 Slim");
        loja.addJogo("PES", "PS4", "PS4 Slim");
        loja.addJogo("F1", "PS4", "PS4 Slim");

        assertEquals("|PS4 Slim|PS4 Pro|", ConsoleFactory.listConsoles());
    }

}