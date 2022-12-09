public class Time {

    //Atributos
    // VAI TOMAR NO CU GITHUB
    private String nome;

    private int vitorias;

    private int derrotas;

    private int empates;

    private int pontos;

    private int saldoGols;

    private int nGols;

    private int nGolsSofridos;

    //Construtor genérico

    public Time(String nome, int vitorias, int derrotas, int empates, int pontos, int saldoGols, int nGols, int nGolsSofridos){

        this.nome = nome;

        this.vitorias = vitorias;

        this.derrotas = derrotas;

        this.empates = empates;

        this.pontos = pontos;

        this.saldoGols = saldoGols;

        this.nGols = nGols;

        this.nGolsSofridos = nGolsSofridos;

    }

    //Construtor padrão

    public Time(){

        this.nome = "";

        this.vitorias = 0;

        this.derrotas = 0;

        this.empates = 0;

        this.pontos = 0;

        this.saldoGols = 0;

        this.nGols = 0;

        this.nGolsSofridos = 0;

    }

    //Construtor

    public Time(String nome){

        this.nome = nome;

    }

    //Getters

    public String getNome(){

        return this.nome;

    }

    public int getVitorias(){

        return this.vitorias;

    }

    public int getDerrotas(){

        return this.derrotas;

    }

    public int getEmpates(){

        return this.empates;

    }

    public int getPontos(){

        return this.pontos;

    }

    public int getSaldoGols(){

        return this.saldoGols;

    }

    public int getnGols(){

        return this.nGols;

    }

    public int getnGolsSofridos(){

        return this.nGolsSofridos;

    }

    //Setters

    public void setNome(String nome){

        this.nome = nome;

    }

    public void setVitorias(int vitorias){

        this.vitorias = vitorias;

    }

    public void setDerrotas(int derrotas){

        this.derrotas = derrotas;

    }

    public void setEmpates(int empates){

        this.empates = empates;

    }

    public void setPontos(int pontos){

        this.pontos = pontos;

    }

    public void setSaldoGols(int saldoGols){

        this.saldoGols = saldoGols;

    }

    public void setnGols(int nGols){

        this.nGols = nGols;

    }

    public void setnGolsSofridos(int nGolsSofridos){

        this.nGolsSofridos = nGolsSofridos;

    }

    //Métodos

    private void definePontos(){    //Define a quantidade de pontos baseado nos atributos

        setPontos(3 * getVitorias() + getEmpates());

    }

}