public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekræftede;
    private int døde;
    private int indlagtePåIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekræftede, int døde, int indlagtePåIntensiv, int indlagte, String dato){
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftede = bekræftede;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public int getBekræftede() {
        return bekræftede;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagtePåIntensiv() {
        return indlagtePåIntensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Nøgletal" +
                "region=" + region + '\'' +
                ", aldersGruppe=" + aldersgruppe + '\'' +
                ", bekræftedeTilfældeIAlt=" + bekræftede +
                ", døde=" + døde +
                ", indlagtePåIntensivAfdeling=" + indlagtePåIntensiv +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'';
        return result;
    }
}
