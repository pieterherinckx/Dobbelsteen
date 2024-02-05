import java.util.Random;

/**
 * class Dobbelsteen - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Dobbelsteen
{
    // declaratie van de klassevariabelen
    private int max;
    private int resultaat;
    private Random random;
    
    /**
     * Constructor van de klasse die de lokale variabele max als parameter krijgt die dan ingesteld wordt op de klasse variabele max.
     */
    public Dobbelsteen(int max){
        this.max = max;
        this.resultaat = 0;
        this.random = new Random();
    }
    
    public Dobbelsteen(){
        this(6);
    }
    
    /**
     * Procedure om de worp te testen
     */
    public void gooi_test(){
        //resultaat = resultaat + 1;
        //resultaat += 1;
        resultaat++;
        if(resultaat > max){
            resultaat = 1;
        }
    }
    
    /**
     * Procedure om willekeurig te gooien
     */
    public void gooi(){
        resultaat = random.nextInt(max) + 1;
    }
    
    /**
     * Functie om de waarde van het resultaat terug te sturen
     */
    public int getResultaat(){
        return resultaat;
    }
}
