package org.pushingpixels.demo.kormorant.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.IsHiDpiAware
import org.pushingpixels.neon.icon.NeonIcon
import org.pushingpixels.neon.icon.NeonIconUIResource
import org.pushingpixels.neon.icon.ResizableIcon

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Ibis SVG transcoder</a>.
 */
class Edit_find(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
	private fun innerPaint(g : Graphics2D) {
        @Suppress("UNUSED_VARIABLE") var shape: Shape?
        @Suppress("UNUSED_VARIABLE") var paint: Paint?
        @Suppress("UNUSED_VARIABLE") var stroke: Stroke?
         
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    val defaultTransform_ = g.transform
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.7836257f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071080207824707f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, Point2D.Double(24.306795120239258, 42.077980041503906), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, 0.0f, 30.089279174804688f))
shape = GeneralPath()
shape.moveTo(40.128307, 42.07798)
shape.curveTo(40.15366, 43.693268, 37.143654, 45.188953, 32.23805, 45.998688)
shape.curveTo(27.332438, 46.808426, 21.28115, 46.808426, 16.375542, 45.998688)
shape.curveTo(11.469933, 45.188953, 8.459927, 43.693268, 8.485281, 42.07798)
shape.curveTo(8.459927, 40.462692, 11.469933, 38.967007, 16.375542, 38.157272)
shape.curveTo(21.28115, 37.347534, 27.332438, 37.347534, 32.23805, 38.157272)
shape.curveTo(37.143654, 38.967007, 40.15366, 40.462692, 40.128307, 42.07798)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0
paint = RadialGradientPaint(Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, Point2D.Double(33.966678619384766, 35.736915588378906), floatArrayOf(0.0f,1.0f), arrayOf(Color(250, 250, 250, 255),Color(187, 187, 187, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.0411319732666016f, 0.0f, 0.0f))
shape = RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746)
g.paint = paint
g.fill(shape)
paint = RadialGradientPaint(Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, Point2D.Double(8.824419021606445, 3.7561285495758057), floatArrayOf(0.0f,1.0f), arrayOf(Color(163, 163, 163, 255),Color(76, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = RadialGradientPaint(Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, Point2D.Double(8.143556594848633, 7.26789665222168), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(248, 248, 248, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(7.666053771972656, 4.583946228027344, 32.77588653564453, 38.94638442993164, 0.2980971336364746, 0.2980971336364746)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.6464470028877258f, -0.03798932954668999f))
// _0_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2_0 = g.transform
g.transform(AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.967081069946289f, 4.244972229003906f))
// _0_1_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_0_0
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(23.428, 113.07)
shape.curveTo(23.428, 115.043, 21.828, 116.642, 19.855, 116.642)
shape.curveTo(17.881, 116.642, 16.282, 115.042, 16.282, 113.07)
shape.curveTo(16.282, 111.096, 17.882, 109.497, 19.855, 109.497)
shape.curveTo(21.828, 109.497, 23.428, 111.097, 23.428, 113.07)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_2_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_0_1
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(23.428, 63.07)
shape.curveTo(23.428, 65.043, 21.828, 66.643, 19.855, 66.643)
shape.curveTo(17.881, 66.643, 16.282, 65.043, 16.282, 63.07)
shape.curveTo(16.282, 61.096, 17.882, 59.497, 19.855, 59.497)
shape.curveTo(21.828, 59.497, 23.428, 61.097, 23.428, 63.07)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_2_0_1
g.transform = defaultTransform__0_1_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_1
paint = RadialGradientPaint(Point2D.Double(20.892099380493164, 114.56839752197266), 5.256f, Point2D.Double(20.892099380493164, 114.56839752197266), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(154, 154, 154, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f))
shape = GeneralPath()
shape.moveTo(9.995011, 29.952326)
shape.curveTo(9.995011, 30.40553, 9.627486, 30.772825, 9.174282, 30.772825)
shape.curveTo(8.720848, 30.772825, 8.353554, 30.4053, 8.353554, 29.952326)
shape.curveTo(8.353554, 29.498892, 8.721078, 29.131598, 9.174282, 29.131598)
shape.curveTo(9.627486, 29.131598, 9.995011, 29.499123, 9.995011, 29.952326)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_2_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_2_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_2
paint = RadialGradientPaint(Point2D.Double(20.892099380493164, 64.56790161132812), 5.257f, Point2D.Double(20.892099380493164, 64.56790161132812), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(154, 154, 154, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f))
shape = GeneralPath()
shape.moveTo(9.995011, 18.467176)
shape.curveTo(9.995011, 18.92038, 9.627486, 19.287905, 9.174282, 19.287905)
shape.curveTo(8.720848, 19.287905, 8.353554, 18.92038, 8.353554, 18.467176)
shape.curveTo(8.353554, 18.013742, 8.721078, 17.646446, 9.174282, 17.646446)
shape.curveTo(9.627486, 17.646446, 9.995011, 18.013971, 9.995011, 18.467176)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_2_2
g.transform = defaultTransform__0_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = Color(0, 0, 0, 4)
stroke = BasicStroke(0.9885531f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(11.505723, 5.4942765)
shape.lineTo(11.505723, 43.400867)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4
paint = Color(255, 255, 255, 52)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(12.5, 5.0205154)
shape.lineTo(12.5, 43.038227)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_4
g.transform = defaultTransform__0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0 = g.transform
g.transform(AffineTransform(0.9090909957885742f, 0.0f, 0.0f, 1.0f, 2.3636279106140137f, 0.0f))
// _0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_0
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 9.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_1
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 11.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_2
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 13.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_3
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 15.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_4
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 17.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_5
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 19.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_6
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 21.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_7
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(15.000001907348633, 23.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_8
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 25.0, 9.900005340576172, 1.0, 0.1364084780216217, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_9
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 29.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_10
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 31.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_11
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 33.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_12
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 35.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_13
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(14.999992370605469, 37.0, 15.40001392364502, 1.0, 0.21219104528427124, 0.13078175485134125)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_0_13
g.transform = defaultTransform__0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1 = g.transform
g.transform(AffineTransform(0.6653770208358765f, 0.0f, 0.0f, 0.6653770208358765f, 15.9864501953125f, 17.908349990844727f))
// _0_2_1
g.composite = AlphaComposite.getInstance(3, 0.17112298f * origAlpha)
val defaultTransform__0_2_1_0 = g.transform
g.transform(AffineTransform(1.446431040763855f, 0.0f, 0.0f, 1.5199899673461914f, -10.974530220031738f, -17.751680374145508f))
// _0_2_1_0
paint = RadialGradientPaint(Point2D.Double(24.13001823425293, 37.96792221069336), 16.528622f, Point2D.Double(24.13001823425293, 37.96792221069336), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.23796799778938293f, -8.82106781655088E-16f, 28.93277931213379f))
shape = GeneralPath()
shape.moveTo(40.65864, 37.967922)
shape.curveTo(40.685127, 39.37734, 37.540596, 40.6824, 32.41574, 41.38893)
shape.curveTo(27.290888, 42.095467, 20.96915, 42.095467, 15.8442955, 41.38893)
shape.curveTo(10.719441, 40.6824, 7.574909, 39.37734, 7.6013966, 37.967922)
shape.curveTo(7.574909, 36.558506, 10.719441, 35.253445, 15.8442955, 34.546913)
shape.curveTo(20.96915, 33.840378, 27.290888, 33.840378, 32.41574, 34.546913)
shape.curveTo(37.540596, 35.253445, 40.685127, 36.558506, 40.65864, 37.967922)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_1
paint = Color(220, 220, 220, 255)
shape = GeneralPath()
shape.moveTo(18.62757, 3.1435547)
shape.curveTo(10.488439, 3.1435547, 3.8827682, 9.749226, 3.8827682, 17.888355)
shape.curveTo(3.8827682, 26.027487, 10.488439, 32.63316, 18.62757, 32.63316)
shape.curveTo(22.107124, 32.63316, 25.17857, 31.248766, 27.701292, 29.23051)
shape.curveTo(27.495914, 30.237392, 27.623257, 31.265879, 28.457436, 31.990437)
shape.lineTo(39.42152, 41.517845)
shape.curveTo(40.654938, 42.589176, 42.508984, 42.448807, 43.58031, 41.21539)
shape.curveTo(44.651638, 39.98197, 44.51127, 38.127926, 43.27785, 37.0566)
shape.lineTo(32.31377, 27.529188)
shape.curveTo(31.642242, 26.94591, 30.82089, 26.773218, 30.00753, 26.886465)
shape.curveTo(31.99423, 24.374044, 33.37237, 21.337664, 33.37237, 17.888355)
shape.curveTo(33.37237, 9.749226, 26.766699, 3.1435547, 18.62757, 3.1435547)
shape.closePath()
shape.moveTo(18.551954, 4.369738)
shape.curveTo(26.191414, 4.369738, 31.843729, 9.158689, 31.843729, 17.661512)
shape.curveTo(31.843729, 26.336626, 26.027039, 30.953287, 18.551954, 30.953287)
shape.curveTo(11.249005, 30.953287, 5.2601805, 25.475197, 5.2601805, 17.661512)
shape.curveTo(5.2601805, 9.677406, 11.084819, 4.369738, 18.551954, 4.369738)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(27.36634063720703, 26.58029556274414), Point2D.Double(31.33596420288086, 30.557771682739258), floatArrayOf(0.0f,1.0f), arrayOf(Color(138, 138, 138, 255),Color(72, 72, 72, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(3.0058157f,1,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(18.62757, 3.1435547)
shape.curveTo(10.488439, 3.1435547, 3.8827682, 9.749226, 3.8827682, 17.888355)
shape.curveTo(3.8827682, 26.027487, 10.488439, 32.63316, 18.62757, 32.63316)
shape.curveTo(22.107124, 32.63316, 25.17857, 31.248766, 27.701292, 29.23051)
shape.curveTo(27.495914, 30.237392, 27.623257, 31.265879, 28.457436, 31.990437)
shape.lineTo(39.42152, 41.517845)
shape.curveTo(40.654938, 42.589176, 42.508984, 42.448807, 43.58031, 41.21539)
shape.curveTo(44.651638, 39.98197, 44.51127, 38.127926, 43.27785, 37.0566)
shape.lineTo(32.31377, 27.529188)
shape.curveTo(31.642242, 26.94591, 30.82089, 26.773218, 30.00753, 26.886465)
shape.curveTo(31.99423, 24.374044, 33.37237, 21.337664, 33.37237, 17.888355)
shape.curveTo(33.37237, 9.749226, 26.766699, 3.1435547, 18.62757, 3.1435547)
shape.closePath()
shape.moveTo(18.551954, 4.369738)
shape.curveTo(26.191414, 4.369738, 31.843729, 9.158689, 31.843729, 17.661512)
shape.curveTo(31.843729, 26.336626, 26.027039, 30.953287, 18.551954, 30.953287)
shape.curveTo(11.249005, 30.953287, 5.2601805, 25.475197, 5.2601805, 17.661512)
shape.curveTo(5.2601805, 9.677406, 11.084819, 4.369738, 18.551954, 4.369738)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_1_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_2
paint = Color(220, 220, 220, 255)
shape = GeneralPath()
shape.moveTo(18.602905, 3.0803552)
shape.curveTo(10.437465, 3.0803552, 3.8104408, 9.707379, 3.8104408, 17.87282)
shape.curveTo(3.8104408, 26.03826, 10.437465, 32.665283, 18.602905, 32.665283)
shape.curveTo(22.093708, 32.665283, 25.175081, 31.276417, 27.70596, 29.251638)
shape.curveTo(27.49992, 30.261774, 27.627672, 31.293585, 28.464546, 32.020485)
shape.lineTo(39.464073, 41.57869)
shape.curveTo(40.701477, 42.653484, 42.561516, 42.51266, 43.636307, 41.275257)
shape.curveTo(44.711098, 40.037853, 44.570274, 38.177814, 43.33287, 37.103024)
shape.lineTo(32.333347, 27.544815)
shape.curveTo(31.659649, 26.959652, 30.835642, 26.786402, 30.019653, 26.900017)
shape.curveTo(32.012775, 24.379473, 33.39537, 21.333277, 33.39537, 17.87282)
shape.curveTo(33.39537, 9.707379, 26.768345, 3.0803552, 18.602905, 3.0803552)
shape.closePath()
shape.moveTo(18.527046, 6.266424)
shape.curveTo(24.808153, 6.2664247, 29.905865, 11.364135, 29.905865, 17.645243)
shape.curveTo(29.905865, 23.926352, 24.808153, 29.024061, 18.527046, 29.024061)
shape.curveTo(12.245938, 29.024061, 7.1482277, 23.926352, 7.1482277, 17.645243)
shape.curveTo(7.1482277, 11.364135, 12.245938, 6.266424, 18.527046, 6.266424)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3
paint = LinearGradientPaint(Point2D.Double(30.65625, 34.0), Point2D.Double(33.21875, 31.0625), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(125, 125, 125, 255),Color(177, 177, 177, 255),Color(104, 104, 104, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3345930576324463f, 0.0f, 0.0f, 1.2912919521331787f, -6.973842144012451f, -7.460658073425293f))
shape = GeneralPath()
shape.moveTo(39.507004, 41.57769)
shape.curveTo(39.02833, 39.304504, 40.904335, 36.76627, 43.091057, 36.789314)
shape.curveTo(43.091057, 36.789314, 32.33069, 27.531204, 32.33069, 27.531204)
shape.curveTo(29.385899, 27.474499, 28.061188, 29.80382, 28.553877, 32.131126)
shape.lineTo(39.507004, 41.57769)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_4 = g.transform
g.transform(AffineTransform(1.2457430362701416f, 0.0f, 0.0f, 1.2457430362701416f, -3.4253458976745605f, -6.177032947540283f))
// _0_2_1_4
paint = LinearGradientPaint(Point2D.Double(18.292673110961914, 13.602121353149414), Point2D.Double(17.500892639160156, 25.74346923828125), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 56),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.206434f,1,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(28.549437, 18.920233)
shape.curveTo(28.567142, 22.879269, 26.465181, 26.545166, 23.039478, 28.529814)
shape.curveTo(19.613773, 30.51446, 15.388013, 30.51446, 11.962308, 28.529814)
shape.curveTo(8.536603, 26.545166, 6.4346433, 22.879269, 6.4523487, 18.920233)
shape.curveTo(6.4346433, 14.961198, 8.536603, 11.295299, 11.962308, 9.310653)
shape.curveTo(15.388013, 7.326006, 19.613773, 7.326006, 23.039478, 9.310653)
shape.curveTo(26.465181, 11.295299, 28.567142, 14.961198, 28.549437, 18.920233)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_1_4
g.composite = AlphaComposite.getInstance(3, 0.4331551f * origAlpha)
val defaultTransform__0_2_1_5 = g.transform
g.transform(AffineTransform(0.7529860138893127f, 0.658037006855011f, -0.6489019989967346f, 0.7608720064163208f, 0.0f, 0.0f))
// _0_2_1_5
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.5029539f,1,0,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(40.37333679199219, 0.14086054265499115, 19.048439025878906, 4.440478324890137, 6.422405242919922, 4.440478324890137)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_1_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_1_6 = g.transform
g.transform(AffineTransform(1.3986140489578247f, 0.0f, 0.0f, 1.3986140489578247f, -6.224338054656982f, -8.298957824707031f))
// _0_2_1_6
paint = RadialGradientPaint(Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, Point2D.Double(18.240928649902344, 21.8179874420166), floatArrayOf(0.0f,1.0f), arrayOf(Color(114, 159, 207, 53),Color(114, 159, 207, 172)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(25.897785, 18.478292)
shape.curveTo(25.9111, 21.455486, 24.330425, 24.212242, 21.754295, 25.704697)
shape.curveTo(19.178165, 27.197151, 16.000395, 27.197151, 13.424265, 25.704697)
shape.curveTo(10.848135, 24.212242, 9.267462, 21.455486, 9.280776, 18.478292)
shape.curveTo(9.267462, 15.501098, 10.848135, 12.744343, 13.424265, 11.251888)
shape.curveTo(16.000395, 9.759435, 19.178165, 9.759435, 21.754295, 11.251888)
shape.curveTo(24.330425, 12.744343, 25.9111, 15.501098, 25.897785, 18.478292)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(48, 99, 163, 255)
stroke = BasicStroke(1.0745695f,1,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(25.897785, 18.478292)
shape.curveTo(25.9111, 21.455486, 24.330425, 24.212242, 21.754295, 25.704697)
shape.curveTo(19.178165, 27.197151, 16.000395, 27.197151, 13.424265, 25.704697)
shape.curveTo(10.848135, 24.212242, 9.267462, 21.455486, 9.280776, 18.478292)
shape.curveTo(9.267462, 15.501098, 10.848135, 12.744343, 13.424265, 11.251888)
shape.curveTo(16.000395, 9.759435, 19.178165, 9.759435, 21.754295, 11.251888)
shape.curveTo(24.330425, 12.744343, 25.9111, 15.501098, 25.897785, 18.478292)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_1_6
g.composite = AlphaComposite.getInstance(3, 0.8342246f * origAlpha)
val defaultTransform__0_2_1_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_7
paint = RadialGradientPaint(Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, Point2D.Double(15.4143705368042, 13.078408241271973), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 63)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.5929629802703857f, -7.746899656918026E-24f, -5.714442921965876E-24f, 2.2521040439605713f, -25.059749603271484f, -18.94099998474121f))
shape = GeneralPath()
shape.moveTo(18.156916, 7.3966937)
shape.curveTo(12.949325, 7.3966937, 8.732368, 11.613651, 8.732368, 16.821241)
shape.curveTo(8.732368, 18.325216, 9.152676, 19.709015, 9.77954, 20.971144)
shape.curveTo(11.03192, 21.432756, 12.362297, 21.746826, 13.774307, 21.746826)
shape.curveTo(19.945263, 21.746826, 24.873589, 16.88519, 25.254414, 10.809698)
shape.curveTo(23.523449, 8.764167, 21.044374, 7.3966937, 18.156916, 7.3966937)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2_1_7
g.transform = defaultTransform__0_2_1
g.transform = defaultTransform__0_2
g.transform = defaultTransform__0
g.transform = defaultTransform_

	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 6.10355281829834
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 3.1464462280273438
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 41.73695755004883
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.853553771972656
        }

        /**
         * Returns an instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Edit_find(width, height))
        }

        /**
         * Returns a [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Edit_find(width, height))
        }
    }

    override fun getIconHeight(): Int {
        return width
    }

    override fun getIconWidth(): Int {
        return height
    }

    override fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override fun isHiDpiAware(): Boolean {
        return true
    }

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
        g2d.translate(x, y)

        val coef1 = this.width.toDouble() / getOrigWidth()
        val coef2 = this.height.toDouble() / getOrigHeight()
        val coef = Math.min(coef1, coef2)
        g2d.clipRect(0, 0, this.width, this.height)
        g2d.scale(coef, coef)
        g2d.translate(-getOrigX(), -getOrigY())
        if (coef1 != coef2) {
            if (coef1 < coef2) {
                val extraDy = ((getOrigWidth() - getOrigHeight()) / 2.0).toInt()
                g2d.translate(0, extraDy)
            } else {
                val extraDx = ((getOrigHeight() - getOrigWidth()) / 2.0).toInt()
                g2d.translate(extraDx, 0)
            }
        }
        val g2ForInner = g2d.create() as Graphics2D
        innerPaint(g2ForInner)
        g2ForInner.dispose()
        g2d.dispose()

    }
}

