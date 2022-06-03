import java.util.HashMap;
import java.util.Map;
/*
 ** created by: jorge.lessa
 */
public class ConsoleFactory {

    private static Map<String, Console> consoleMap = new HashMap<>();

    public static Console getConsole(String nome, String modelo)
    {
        Console console = null;
        if (consoleMap.containsKey(modelo))
        {
            console = consoleMap.get(modelo);
        } else
        {
            console = new Console(nome, modelo);
            consoleMap.put(modelo, console);
        }
        return console;
    }


    public static String listConsoles()
    {
        String modelos = "|";
        for (String modelo : consoleMap.keySet())
        {
            modelos += modelo + "|";
        }
        return modelos;
    }

}
