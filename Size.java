/**
 * Definição do tamanho dos copos.
 * 
 * @author (Rafael Silva) 
 * @version (1.0)
 */
public enum Size
{
    //Atributos
    SMALL(32, 36, "Pequeno",'S'), MEDIUM(37, 44, "Médio",'M'), LARGE(45, 52, "Grande",'L');

    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;

    //Metodo contrutor
    private Size(int minValue, int maxValue, String description, char code){
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }

    @Override
    public String toString() {
        return this.description;
    }
    
    /**
     * Este metodo vai retornar a variavel description dependendo do tamanho do copo
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Este metodo vai retornar a variavel minValue dependendo do tamanho do copo
     */
    public int getMinValue() {
        return minValue;
    }
    
    /**
     * Este metodo vai retornar a variavel maxValue dependendo do tamanho do copo
     */
    public int getMaxValue() {
        return maxValue;
    }
    
    /**
     * Este metodo vai retornar a variavel code dependendo do tamanho do copo
     */
    public char getCode() {
        return code;
    }
}
