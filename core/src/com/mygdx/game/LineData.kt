package com.mygdx.game

import org.jfree.chart.ChartFactory
import org.jfree.chart.ChartPanel
import org.jfree.chart.plot.PlotOrientation
import org.jfree.data.xy.XYSeries
import org.jfree.data.xy.XYSeriesCollection
import org.luaj.vm2.LuaError
import org.luaj.vm2.LuaValue
import org.luaj.vm2.lib.jse.CoerceJavaToLua
import org.luaj.vm2.lib.jse.JsePlatform
import java.util.*
/**
 * Created by Byungpil on 2017-06-14.
 */
fun main(args: Array<String>){
    val globals= JsePlatform.standardGlobals()
    val chunk = globals.load(
            """
            a={1,2,3,4,5}
            return a
            """)
}

