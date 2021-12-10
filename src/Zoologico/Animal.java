package Zoologico;

public abstract class Animal {
    private String especie;
    private String nome;
    private int idade;
    private float peso;
    protected boolean vivo;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Animal(String especie, String nome, int idade, float peso) {
        setEspecie(especie);
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setVivo(true);
    }

    public abstract void emitirbarulho();

    public void morrer(){
        if(isVivo()){
            setVivo(false);
            System.out.println("O animal morreu.");
        }else{
            System.out.println("O animal já estava morto.");
        }
    }
}
