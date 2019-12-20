package com.expansion.view

enum class ExpansionIconStyles {
    SQUARE, CIRCLE, ROUNDED_SQUARE;

    companion object {
        fun getByIndex(index: Int): ExpansionIconStyles {
            return when (index) {
                CIRCLE.ordinal -> CIRCLE
                ROUNDED_SQUARE.ordinal -> ROUNDED_SQUARE
                else -> SQUARE
            }
        }
    }
}