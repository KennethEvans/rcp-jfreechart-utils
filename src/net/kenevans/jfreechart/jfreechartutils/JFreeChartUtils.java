/*
 * Program to 
 * Created on Dec 29, 2006
 * By Kenneth Evans, Jr.
 */

package net.kenevans.jfreechart.jfreechartutils;

import java.awt.Color;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.title.LegendTitle;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RectangleInsets;

public class JFreeChartUtils
{
    /**
     * Creates a legend for a chart that is like the default legend. May only
     * work for an XYLineChart.
     * 
     * @param chart
     */
    public static void createDefaultLegend(JFreeChart chart) {
        if(chart == null) return;
        LegendTitle legend = new LegendTitle(chart.getPlot());
        if(legend == null) return;
        legend.setPosition(RectangleEdge.BOTTOM);
        legend.setMargin(new RectangleInsets(1.0, 1.0, 1.0, 1.0));
        // legend.setMargin(new RectangleInsets(3, 3, 3, 3));
        legend.setBackgroundPaint(Color.white);
        // legend.setBorder(new BlockBorder());
        chart.addLegend(legend);
    }

    /**
     * Creates a legend for a chart that less elaborate than the default legend.
     * May only work for an XYLineChart.
     * 
     * @param chart
     */
    public static void createLegend(JFreeChart chart) {
        if(chart == null) return;
        LegendTitle legend = new LegendTitle(chart.getPlot());
        legend.setPosition(RectangleEdge.BOTTOM);
        if(legend == null) return;
        // legend.setMargin(new RectangleInsets(3, 3, 3, 3));
        // legend.setBackgroundPaint(Color.white);
        // legend.setBorder(new BlockBorder());
        chart.addLegend(legend);
    }

}
