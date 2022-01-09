package ma.ensa.SmartHome.beans;

import lombok.Data;

@Data
public class Adresse {
    private String cityName;
    public Integer CP ;

    public Adresse(Integer codePostale, String cityName) {
        this.CP = codePostale;
        this.cityName = cityName;
    }

    public Adresse() {
    }
}
