package com.atakanoguzdev.restTemplateExp.dto.converter;

import com.atakanoguzdev.restTemplateExp.dto.AvgPriceDto;
import com.atakanoguzdev.restTemplateExp.model.AvgPrice;
import org.springframework.stereotype.Component;

@Component
public class AvgPriceDtoConverter {

    public AvgPriceDto convert(AvgPrice from){
        return new AvgPriceDto(from.getMins(),from.getPrice(), from.getSymbol());
    }
}
