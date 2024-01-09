package pacote2;

import pacote1.Classe1;
import pacote1.Classe2;

public class Classe3 extends Classe2 {

    private String propriedadePrivada;

    public String propriedadePublica;

    String propriedadeDefault;

    protected String propriedadeProtected;
    public static void main(String [] args) {
        Classe1 classe1 = new Classe1();
        classe1.testeNicolas();

    }
}
