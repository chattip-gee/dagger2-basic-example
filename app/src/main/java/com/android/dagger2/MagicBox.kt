package com.android.dagger2

import dagger.Component

@Component
interface MagicBox {
    fun poke(app: MainActivity)
}