package Main;
import model.Veiculos;
public class main {
    public static void main(String[] args) {


        Veiculos v1 = new Veiculos("joao", "H@AG#", 0);
        System.out.println("combustivel atualizado "  + v1.getCombustivel() );

        v1.adicionar(200);
        v1.gasta(50);

        System.out.println("Dono: " + v1.getNome() + " | placa: " + v1.getPlaca() + " | Gasolina: " + v1.getCombustivel());
    }
}
