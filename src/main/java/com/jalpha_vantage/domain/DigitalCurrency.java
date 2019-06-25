package com.jalpha_vantage.domain;

import com.jalpha_vantage.enums.CryptoSymbol;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class DigitalCurrency {
    protected CryptoSymbol symbol;
    protected String market;
    protected String volume;
    protected String marketCap;


    public static DigitalCurrencyDaily daily(CryptoSymbol symbol, String market, String open, String usdOpen, String high, String usdHigh, String low, String usdLow, String close, String usdClose, String volume, String marketCap, LocalDate date) {
        return new DigitalCurrencyDaily(symbol, market, open,usdOpen,high, usdHigh ,low,usdLow, close, usdClose, volume, marketCap, date);
    }

    public static DigitalCurrency intraDay(CryptoSymbol symbol, String market, String price, String usdPrice, String volume, String marketCap, LocalDateTime dateTime) {
        return new DigitalCurrencyIntraDay(symbol, market, price, usdPrice, volume, marketCap,dateTime);
    }
}
