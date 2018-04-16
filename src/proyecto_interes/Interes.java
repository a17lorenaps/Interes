
package proyecto_interes;

/**
 * Cálculo de interés simple = capital * redito * tiempo/100.
 * El capital y el tiempo son >0.
 * El redito puede ser negativo o cero.
 * @author uadmin
 * @version 1.0.0
 */
public class Interes {

    /**
     * Clase Interese que ten 3 parametros privados e unha variable publica enteira
     * x e unha variable enteira que inicializa no valor 2.
     * os parametos capital e redito son de tipo decimal
     * tiempo é un parametro de tipo enteiro
     */
    public int x=2;
    private float capital;
    private float redito;
    private int tiempo;

    /**
     * Constructor para a clase Interes que asigna valores a la 
     * capital, redito e tempo
     * @param capital Capital de tipo decimal
     * @param redito  Redito de tipo decimal
     * @param tiempo  tiempo de tipo enteiro
     */
    public Interes(float capital, float redito, int tiempo) {        
        this.capital=capital;
        this.redito=redito;
        this.tiempo=tiempo;
    }

    /**
     * Método que permite obter o interes
     * @return capital*rendito*tiempo de tipo decimal
     * @throws Exception verifica que o capital e o tempo e maior ou igual que cero, en caso contrario envia un mensaxe
     */
    public double CalcularInteres()throws Exception{
        if (capital<=0)
            throw (new Exception ("Error. El capital tiene que ser >=0"));
        if (tiempo<=0)
            throw (new Exception ("Error. El interés tiene que ser >=0"));
        x=25;
        return (double)capital*redito*tiempo/100;
    }
}
