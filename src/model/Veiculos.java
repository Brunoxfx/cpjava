package model;

public class Veiculos {
    private String nome;
    private String placa;
    private int combustivel;

    public Veiculos(String nome, String placa, int combustivel){
        this.setNome(nome);
        this.setPlaca(placa);
        this.setCombustivel(0);
    }
    public void adicionar (int v){
        this.combustivel += v;
        System.out.println("combustivel adicionado...");
        System.out.println("Combustivel atualizado " + getCombustivel());

    }


    public void gasta (int g){
        this.combustivel -= g;
        System.out.println("combustivel gastando...");
        System.out.println("combustivel atualizado " + getCombustivel());;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
}
