package com.example.monthlyrecycleview.data

import com.example.monthlyrecycleview.Month
import com.example.monthlyrecycleview.R



class Datasourc {
    fun loadMonth(): List<Month.month> {
        return listOf<Month.month>(
            Month.month(R.string.M1),
            Month.month (R.string.M2),
            Month.month(R.string.M3),
            Month.month (R.string.M4),
            Month.month (R.string.M5),
            Month.month(R.string.M6),
            Month.month(R.string.M7),
            Month.month(R.string.M8),
            Month.month(R.string.M9),
            Month.month(R.string.M10),
            Month.month(R.string.M11),
            Month.month(R.string.M12)
        )
    }

    }

