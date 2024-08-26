/**
 * Classe exemplificando o funcionamento de um ventilador
 * @author Arthur Queiroz
 * @version 1.0
 */

public class Ventilador {
    private boolean ligado = false;
    private int intensidade = 1;

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    /** método para aumentar a intensidade do ventilador
     *
     * @return int - valor da intensidade
     */
    public int aumentarIntensidade (){
        if (this.intensidade <= 3){
            return ++this.intensidade;
        }else{
            System.out.println("A intensidade já está no máximo");
            return this.intensidade;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /**
     * método para ligar ou desligar o ventilador
     * @return boolean - ventilador ligado ou desligado
     */
    public boolean ligarDesligar(){
        this.ligado = !this.ligado;
        return this.ligado;
    }
}
