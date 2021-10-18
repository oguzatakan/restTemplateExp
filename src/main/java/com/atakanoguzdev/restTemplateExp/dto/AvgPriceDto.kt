package com.atakanoguzdev.restTemplateExp.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class AvgPriceDto(
        val mins: Int,
        val price: BigDecimal,
        val symbol: String
)
