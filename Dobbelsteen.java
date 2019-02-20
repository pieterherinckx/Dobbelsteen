import java.util.Random;
/**
 * Write a description of class Dobbelsteen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dobbelsteen
{
    private int max;
    private int resultaat;
    private Random rg;
    
    public Dobbelsteen(int max){
        this.max = max;
        this.resultaat = 0;
        this.rg = new Random();
    }
    
    public Dobbelsteen(){
        this(6):
    }
    
    public int getResultaat(){
        return resultaat;
    }
    
    public void gooi(){
        resultaat = rg.nextInt(max)+1;    
    }
}
