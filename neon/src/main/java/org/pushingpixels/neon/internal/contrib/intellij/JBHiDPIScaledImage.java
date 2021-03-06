/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pushingpixels.neon.internal.contrib.intellij;

import org.pushingpixels.neon.icon.IsHiDpiAware;

import java.awt.*;
import java.awt.image.*;

/**
 * @author Konstantin Bulenkov
 */
public class JBHiDPIScaledImage extends BufferedImage implements IsHiDpiAware {
    private boolean ignoreScaling;

    private JBHiDPIScaledImage(int width, int height, int type) {
        super(width, height, type);
    }

    private JBHiDPIScaledImage(ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied) {
        super(cm, raster, isRasterPremultiplied, null);
    }

    public static JBHiDPIScaledImage create(int width, int height, int type) {
        return new JBHiDPIScaledImage((int) (UIUtil.getScaleFactor() * width),
                (int) (UIUtil.getScaleFactor() * height), type);
    }

    public static JBHiDPIScaledImage createUnscaled(int width, int height, int type) {
        JBHiDPIScaledImage result = new JBHiDPIScaledImage(width, height, type);
        result.ignoreScaling = true;
        return result;
    }

    public static JBHiDPIScaledImage create(ColorModel cm, WritableRaster raster,
            boolean isRasterPremultiplied) {
        return new JBHiDPIScaledImage(cm, raster, isRasterPremultiplied);
    }

    @Override
    public boolean isHiDpiAware() {
        return true;
    }

    @Override
    public Graphics2D createGraphics() {
        Graphics2D g = super.createGraphics();
        if (!this.ignoreScaling) {
            double scaleFactor = UIUtil.getScaleFactor();
            g.scale(scaleFactor, scaleFactor);
        }
        return new HiDPIScaledGraphics(g);
    }
}
