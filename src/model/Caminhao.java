package model;

import javax.swing.JOptionPane;

/**
 *
 * @author assparremberger
 */
public class Caminhao extends Veiculo{
    public int eixos;
    public double carga;

    public Caminhao() {
    }

    public Caminhao(String _modelo) {
        super(_modelo);
    }

    public Caminhao(int eixos, double carga, String _modelo) {
        super(_modelo);
        this.eixos = eixos;
        this.carga = carga;
    }
    
    @Override
    public void cadastrar() {
        String texto = "Caminhão " + this.modelo +
                " com " + this.eixos + 
                " eixos, cadastrado com sucesso!";
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
