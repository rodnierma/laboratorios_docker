package bo.com.capacitacion.capacitacion_service.dto;

import java.io.Serializable;

public class CurrencyDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String name;
    private String symbol;

    public CurrencyDTO() {
    }

    public CurrencyDTO(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "CurrencyDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
