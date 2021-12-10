package Zoologico;

public class Cachorro extends Animal {

    public Cachorro(String especie, String nome, int idade, float peso, boolean vivo) {
        super(especie, nome, idade, peso, vivo);
    }

    @Override
    public void emitirbarulho() {
        System.out.println("Au au!");
    }

}

