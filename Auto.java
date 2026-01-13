public class Auto
{
    private String marka;
    private String tipus;
    private int loEro;
    private int hengerUrtaltalom;

    public void setMarka(String marka)
    {
        this.marka = marka;
    }

    public void setTipus(String tipus)
    {
        this.tipus = tipus;
    }

    public void setLoEro(int loEro)
    {
        this.loEro = loEro;
    }

    public void setHengerUrtaltalom(int hengerUrtaltalom)
    {
        this.hengerUrtaltalom = hengerUrtaltalom;
    }

    public String getMarka()
    {
        return marka;
    }

    public String getTipus()
    {
        return tipus;
    }

    public int getLoEro()
    {
        return loEro;
    }

    public int getHengerUrtaltalom()
    {
        return hengerUrtaltalom;
    }

    public Auto(String marka, String tipus, int loEro, int hengerUrtaltalom)
    {
        this.marka = marka;
        this.tipus = tipus;
        this.loEro = loEro;
        this.hengerUrtaltalom = hengerUrtaltalom;
    }
}
