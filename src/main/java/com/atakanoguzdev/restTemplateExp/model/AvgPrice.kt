package com.atakanoguzdev.restTemplateExp.model

import java.math.BigDecimal
import java.time.LocalDateTime

data class AvgPrice(
        val mins: Int,
        val price: BigDecimal,
        var symbol: String

)
