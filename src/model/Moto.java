package model;

import javax.swing.JOptionPane;

/**
 *
 * @author assparremberger
 */
public class Moto extends Veiculo{
    public int cilindradas;
    public boolean partidaEletrica;
    
    public Moto(){
        
    }
    public Moto(String modelo){
        super(modelo);
    }

    public Moto(int cilindradas, boolean partidaEletrica, String _modelo) {
        super(_modelo);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public void cadastrar() {
        String texto = "Moto " + this.modelo +
                " com " + this.cilindradas + 
                " cilindradas, cadastrada com sucesso!";
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
}
