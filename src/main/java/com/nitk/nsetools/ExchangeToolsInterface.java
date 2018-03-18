package com.nitk.nsetools;

import com.nitk.nsetools.domain.StockQuote;
import java.util.HashMap;
import java.util.List;

public interface ExchangeToolsInterface {
    public HashMap<String,String> getStockCodes() throws Exception;  
    public boolean isValidCode(String stockCode) throws Exception;
    public List<String> getIndexList() throws Exception;
    public boolean isValidIndex(String index) throws Exception;
    public StockQuote getQuote(String symbol) throws Exception;
}